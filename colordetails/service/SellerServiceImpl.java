package com.example.colordetails.service;

import com.example.colordetails.entity.SellerInfo;
import com.example.colordetails.entity.Store;
import com.example.colordetails.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    //  管理员，查询所有借卖方信息
    @Override
    public List<SellerInfo> findAllSeller() {

        return sellerRepository.findAllSeller();
    }

    //借卖方
    //修改借卖方个人信息
    @Override
    public SellerInfo updateSellerInfo(SellerInfo sellerInfo) {
        return sellerRepository.save(sellerInfo);
    }
    //添加借卖方
    @Override
    public SellerInfo addSellerInfo(SellerInfo sellerInfo) {
        return sellerRepository.save(sellerInfo);
    }
    //按id查询借卖方信息
    @Override
    public SellerInfo findSellerById(Integer id) {
        return sellerRepository.findSellerById(id);
    }
    //按user_id查询借卖方信息
    @Override
    public SellerInfo findSellerByUser_Id(Integer user_id) {

        return sellerRepository.findSellerByUser_Id(user_id);
    }


}
