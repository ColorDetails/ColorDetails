package com.example.colordetails.service;
import com.example.colordetails.entity.CommodityInfo;
import java.util.List;

public interface CommodityService {
//    查询所有商品信息
    List<CommodityInfo> findAllCommodity();
//修改商品信息
    CommodityInfo updateCommodify(CommodityInfo commodityInfo);
//    添加新商品
    CommodityInfo addCommodity(CommodityInfo commodityInfo);
//    按Id查找商品
    CommodityInfo findCommodityById(Integer id);
//    删除单条商品
    void  deleteCommodityById(Integer id);

    //根据Brand_Id查询对应品牌商的所有商品
    List<CommodityInfo> findCommodityByBrandId(Integer id);
    //根据商品id上架商品

    void upCommodityById(Integer id);
    //根据商品id下架商品
    void downCommodityById(Integer id);
}
