package com.example.colordetails.controller;
import com.example.colordetails.Util.FileUtil;
import com.example.colordetails.entity.BrandInfo;
import com.example.colordetails.entity.CommodityInfo;
import com.example.colordetails.entity.User;
import com.example.colordetails.entity.Wallet;
import com.example.colordetails.service.BrandService;
import com.example.colordetails.service.CommodityService;
import com.example.colordetails.service.SellerService;
import com.example.colordetails.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
@Controller
public class CommodityController {
    @Autowired
    private CommodityService commodityService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private SellerService sellerService;
    @Autowired
    private WalletService walletService;
    // 查询所有商品
    @GetMapping("findAllCommodity")
    public String findAllCommodity(Model model) {
        List<CommodityInfo> list = commodityService.findAllCommodity();
        model.addAttribute("list", list);
        return "SellerStock";
    }
    //添加商品,收到来自session的user_id
    @GetMapping("addCommodityPage/{Id}")
    public String addCommodityPage(@PathVariable("Id") Integer id,Model model) {
        model.addAttribute("list",brandService.findBrandByUserId(id));
        return "CommodityAdd";
    }
    @PostMapping("addCommodity")
    public String addPicture(CommodityInfo commodityInfo, @RequestParam("file") MultipartFile file) {
        String contentType = file.getContentType();//定义图片文件类型
        String fileName = file.getOriginalFilename();//定义图片名字
        String filePath = FileUtil.getUpLoadFilePath();//文件路径，（绝对路径）
        fileName = System.currentTimeMillis() + fileName;//文件名，毫秒加原名
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
        }
        Date date = new Date();
//        commodityInfo.setState(0);//默认设置商品状态为1
        commodityInfo.setCreate_time(date);//设置创建时间为当前系统时间
        commodityInfo.setImage(fileName);//重新设置图片名
        commodityService.addCommodity(commodityInfo);
        return "redirect:/findCommodityByBrandId/"+commodityInfo.getBrand_Id();
    }
    // 修改商品信息
    @GetMapping("modifyPage/{id}")
    public String modifyPage(@PathVariable("id") Integer id, Model model) {
        CommodityInfo list = commodityService.findCommodityById(id);
        model.addAttribute("commoddity", list);
        return "CommodityModify";
    }
    //根据id删除商品
    @GetMapping("deleteByCommodityId/{id}")
    public  String deleteByCommodityId(@PathVariable("id")Integer id){
        Integer brand_id=commodityService.findCommodityById(id).getBrand_Id();
        commodityService.deleteCommodityById(id);
        return "redirect:/findCommodityByBrandId/"+brand_id;
    }

    //根据品牌商id查询对应商品
    @GetMapping("findCommodityByBrandId/{id}")
    public String findCommodityByBrandId(@PathVariable("id")Integer id,Model model){
        model.addAttribute("list",commodityService.findCommodityByBrandId(id));
        return "CommodityManage";
    }

    //根据品牌商id查询对应商品,url传来的id为user_id
    @GetMapping("findCommodityById/{id}")
    public String findCommodityById(@PathVariable("id")Integer id,Model model){
        Integer brandId=brandService.findBrandByUserId(id).getId();
        model.addAttribute("list",commodityService.findCommodityByBrandId(brandId));
        return "CommodityManage";
    }
    //根据id商品上架
    @GetMapping("upCommodityById/{id}/{user_id}")
    public String upCommodityById(@PathVariable("id") Integer id,@PathVariable("user_id") Integer user_id){
        commodityService.upCommodityById(id);
        return "redirect:/findCommodityById/"+user_id;
    }
    //根据id商品下架
    @GetMapping("downCommodityById/{id}/{user_id}")
    public String downCommodityById(@PathVariable("id") Integer id,@PathVariable("user_id") Integer user_id){
        commodityService.downCommodityById(id);
        return "redirect:/findCommodityById/"+user_id;
    }
    @PostMapping("buyCommodity")
    public String buyCommodity(@RequestParam("number") Integer number,@RequestParam("Id") Integer id,@RequestParam("userId") Integer userId){
        //获取购买的商品
        CommodityInfo commodity=commodityService.findCommodityById(id);
        //获取到购买者
        Wallet wallet=walletService.findWalletByUserId(userId);
        //判断购买数量是否超出商品库存
        if (number < commodity.getNumber()){
//            计算总金额
            Float total=commodity.getPrice()*number;
//            判断余额够不够
            if (total < wallet.getMoney()){
//                计算购买后的库存和余额
                Integer buyLater=commodity.getNumber()-number;
                Float buyLaterMoney=wallet.getMoney()-total;
//                赋值给对象
                commodity.setNumber(buyLater);
                wallet.setMoney(buyLaterMoney);
//                存入新对象
                commodityService.updateCommodify(commodity);
                walletService.addWalletByUserId(wallet);
            }else {
                String msg="你钱不够啊！傻孩子";
            }
        }else {
            String msg="你买太多了！傻孩子";
        }
        return "redirect:/findAllCommodity";
    }
}
