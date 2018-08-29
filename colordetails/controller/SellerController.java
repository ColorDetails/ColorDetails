package com.example.colordetails.controller;

import com.example.colordetails.entity.SellerInfo;
import com.example.colordetails.entity.SellerInfo;
import com.example.colordetails.entity.Wallet;
import com.example.colordetails.service.SellerService;
import com.example.colordetails.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SellerController {
    @Autowired
    private SellerService sellerService;
    @Autowired
    private WalletService walletService;


    //以下为管理员操作的控制
    //管理员查询所有借卖方
    @GetMapping("findAllSellerInfo")
    private String findAllSellerInfo(Model model) {
        List<SellerInfo> list = sellerService.findAllSeller();
        model.addAttribute("list", list);
        return "AdminForSeller";
    }

    //以下为借卖商的操作控制
    //借卖商跳转到我的主页
    @GetMapping("goSellerindex")
    private String goSellerindex() {
        return "SellerIndex";
    }

    //跳转到修改界面
    @GetMapping("updateSellerInfoById/{id}")
    private String updatePage(@PathVariable("id") Integer id, Model model) {
        SellerInfo sellerInfo = sellerService.findSellerById(id);
        model.addAttribute("seller", sellerInfo);
        return "SellerUpdate";
    }

    //修改功能
    @PostMapping("updateSellerInfo")
    public String updateSeller(SellerInfo sellerInfo,Model model) {
        model.addAttribute("list",sellerService.updateSellerInfo(sellerInfo));
        return "SellerInfo";
    }

    //借卖方个人信息，根据user_id
    @GetMapping("findSellerInfoByUserId/{user_id}")
    public String findSellerInfoByUserId(@PathVariable("user_id") Integer user_id, Model model) {
        SellerInfo sellerInfo = sellerService.findSellerByUser_Id(user_id);
        model.addAttribute("seller", sellerInfo);
        return "SellerInfo";
    }
    //根据user_id查借卖方信息,传回来的是user_id
    @GetMapping("findSellerInfoById/{id}")
    public String findSellerInfoById(@PathVariable("id") Integer id, Model model) {
        if (sellerService.findSellerByUser_Id(id) == null) {
            SellerInfo sellerInfo = new SellerInfo();
            sellerInfo.setUser_Id(id);
            SellerInfo sellerInfo1 = sellerService.addSellerInfo(sellerInfo);
            model.addAttribute("list", sellerService.findSellerByUser_Id(sellerInfo1.getId()));
            return "SellerInfo";
        }
        model.addAttribute("list", sellerService.findSellerByUser_Id(id));
        return "SellerInfo";
    }
}
