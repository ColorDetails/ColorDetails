package com.example.colordetails.service;
import com.example.colordetails.entity.Wallet;
import com.example.colordetails.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {
    //新注册用户添加生成钱包
    @Override
    public Wallet addWalletByUserId(Wallet wallet) {
        return walletRepository.save(wallet);
    }
    @Autowired
    private WalletRepository walletRepository;
    //查询所有钱包信息
    @Override
    public List<Wallet> findAllWallet() {
        return walletRepository.findAllWallet();
    }
    //按user_id查询钱包信息
    @Override
    public Wallet findWalletByUserId(Integer user_id) {
        return walletRepository.findByWalletUserId(user_id);
    }
    //按id查询钱包信息
    @Override
    public Wallet findByWalletID(Integer id) {
        return walletRepository.findByWalletID(id);
    }
    //更新
    @Override
    public Wallet updatePayPassword(Wallet wallet) {
        return walletRepository.save(wallet);
    }
    //删除
    @Override
    public void deleteByWalletUserId(Integer id) {
        walletRepository.deleteById(id);
    }


}
