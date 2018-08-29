package com.example.colordetails.service;
import com.example.colordetails.entity.CommodityInfo;
import com.example.colordetails.repository.CommodityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityRepository commodityRepository;
    //    查询所有商品信息
    @Override
    public List<CommodityInfo> findAllCommodity() {
        return commodityRepository.findAllCommodity();
    }
    //修改商品信息
    @Override
    public CommodityInfo updateCommodify(CommodityInfo commodityInfo) {
        return commodityRepository.save(commodityInfo);
    }
    //    添加新商品
    @Override
    public CommodityInfo addCommodity(CommodityInfo commodityInfo) {
        return commodityRepository.save(commodityInfo);
    }
    //    按Id查找商品
    @Override
    public CommodityInfo findCommodityById(Integer id) {
        return commodityRepository.findByCommodityId(id);
    }
    //    删除单条商品
    @Override
    public void deleteCommodityById(Integer id) {
        commodityRepository.deleteById(id);
    }

    @Override
    public List<CommodityInfo> findCommodityByBrandId(Integer id) {
        return commodityRepository.findCommodityByBrandId(id);
    }

    //根据商品id上架商品
    @Transactional
    @Override
    public void upCommodityById(Integer id) {
        commodityRepository.upCommodityById(id);
    }
    //根据商品id下架商品
    @Transactional
    @Override
    public void downCommodityById(Integer id) {
        commodityRepository.downCommodityById(id);
    }
}
