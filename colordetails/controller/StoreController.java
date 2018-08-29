package com.example.colordetails.controller;


import com.example.colordetails.Util.FileUtil;
import com.example.colordetails.entity.SellerInfo;
import com.example.colordetails.entity.Store;
import com.example.colordetails.service.SellerService;
import com.example.colordetails.service.StoreService;
import com.example.colordetails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class StoreController {
    @Autowired
    private StoreService storeService;
    @Autowired
    private UserService userService;
    @Autowired
    private SellerService sellerService;
    //根据借卖商id查询店铺
    @GetMapping("findAllStoreBySellerId/{id}")
    public String findAllStoreBySellerId(@PathVariable("id") Integer id,Model model) {
        List<Store> list = storeService.findStoreBySellerId(id);
        model.addAttribute("list", list);
        return "SellerStore";
    }
    //根据user_id查询借卖商信息
    @GetMapping("findStoreByUserId/{id}")
    public String findStoreByUserId(@PathVariable("id") Integer id, Model model) {
        //根据user_id查询借卖商的id
        Integer id1 = sellerService.findSellerByUser_Id(id).getId();
        //System.out.print(storeService.findStoreBySellerId(id1));
        if (storeService.findStoreBySellerId(id1).isEmpty()){
            Store store=new Store();
            store.setSeller_Id(id1);
            model.addAttribute("list",storeService.addStore(store));
            return "SellerStore";
        }
        model.addAttribute("list", storeService.findStoreBySellerId(id1));
        return "SellerStore";
    }
    //跳转到添加网店页面
    @GetMapping("addStorePage/{id}")
    public String addStorePage(@PathVariable("id") Integer id, Model model) {
        SellerInfo seller = sellerService.findSellerById(id);
        model.addAttribute("list",seller);
        return "StoreAdd";
    }
    //添加信息、图片
    @PostMapping("addStore")
    public String addPicture(Store Store, @RequestParam("file") MultipartFile file) {
        String contentType = file.getContentType();//定义图片文件类型
        String fileName = file.getOriginalFilename();//定义图片名字
        String filePath = FileUtil.getUpLoadFilePath();//文件路径，（绝对路径）
        fileName = System.currentTimeMillis() + fileName;//文件名，毫秒加原名
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
//            e.printStackTrace();
        }
        Store.setStore_Logo(fileName);
        storeService.addStore(Store);
        return "redirect:/findAllStoreBySellerId/"+Store.getSeller_Id();
    }
    // 修改时跳转到修改页面
    @GetMapping("modifyStorePage/{id}")
    public String modifyPage(@PathVariable("id") Integer id, Model model) {
        Store list = storeService.findStoreById(id);
        model.addAttribute("store", list);
        return "StoreModify";
    }
//根据id修改店铺信息
    @PostMapping("updateStore")
    public String updateStore(Store store) {
        storeService.updateStore(store);
        return "redirect:/findAllStoreBySellerId/"+store.getSeller_Id();
    }

    @GetMapping("deleteStoreById/{id}")
    public String deleteStoreById(@PathVariable("id") Integer id) {
        Integer storesid=storeService.findStoreById(id).getSeller_Id();
        storeService.deleteStoreById(id);
        return "redirect:/findAllStoreBySellerId/"+storesid;
    }


}
