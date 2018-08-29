package com.example.colordetails.service;

import com.example.colordetails.entity.Wallet;

import java.util.List;

public interface WalletService {
    //新注册用户添加生成钱包
    Wallet addWalletByUserId(Wallet wallet);
    //查询所有钱包信息
    List<Wallet> findAllWallet();
    //根据user_id查询钱包信息
    Wallet findWalletByUserId(Integer user_id);
    //根据id查询钱包信息
    Wallet findByWalletID(Integer id);
    //修改密码
    Wallet updatePayPassword(Wallet wallet);
    //根据user_id删除钱包信息
    void deleteByWalletUserId(Integer id);
    //对余额进行操作

}
