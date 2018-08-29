package com.example.colordetails.service;


import com.example.colordetails.entity.SellerInfo;
import com.example.colordetails.entity.Wallet;

import java.util.List;

public interface SellerService {

    //  管理员，查询所有借卖方信息
    List<SellerInfo> findAllSeller();

    //    借卖方
//    修改借卖方个人信息
    SellerInfo updateSellerInfo(SellerInfo sellerInfo);
    //    添加借卖方信息（或许可用于注册）
    SellerInfo addSellerInfo(SellerInfo sellerInfo);
    //    根据id查询借卖方信息
    SellerInfo findSellerById(Integer id);
    //    根据user_id查询借卖方信息
    SellerInfo findSellerByUser_Id(Integer user_id);
    //



}
