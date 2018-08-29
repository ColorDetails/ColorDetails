package com.example.colordetails.controller;
import com.example.colordetails.entity.Wallet;
import com.example.colordetails.service.SellerService;
import com.example.colordetails.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class WalletController {
    @Autowired
    WalletService walletService;
    @Autowired
    SellerService sellerService;
    @GetMapping("WalletPage")
    public String WalletPage(){
        return "SellerWallet";
    }
    //    //查钱包信息，根据user_id
//    @GetMapping("findWalletByUserId/{user_id}")
//    public String findWalletByUserId(@PathVariable("user_id")Integer user_id, Model model){
//        Wallet wallet = walletService.findByWalletUserId(user_id);
//        model.addAttribute("wallet",wallet);
//        return "SellerWallet";
//    }
    //根据user_id查钱包信息,查回来的是user_id
    @GetMapping("findWalletByUserId/{id}")
    public String findWalletByUserId(@PathVariable("id") Integer id, Model model) {
        if (walletService.findWalletByUserId(id) == null) {
            Wallet  wallet = new Wallet();
            wallet.setUser_Id(id);

            Wallet wallet1 = walletService.addWalletByUserId(wallet);

            model.addAttribute("list", walletService.findWalletByUserId(wallet1.getId()));
            return "SellerInfo";
        }
        model.addAttribute("list", walletService.findWalletByUserId(id));
        return "SellerWallet";
    }

    //提现功能

    //充值功能

}
