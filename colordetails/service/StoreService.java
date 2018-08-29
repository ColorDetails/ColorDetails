package com.example.colordetails.service;


import com.example.colordetails.entity.Store;

import java.util.List;

public interface StoreService {
    //    查询所有网店信息
    List<Store> findAllStore();
    //  修改网店信息
    Store updateStore(Store Store);
    //    添加新网店
    Store addStore(Store Store);
    //    按Id查找网店
    Store findStoreById(Integer id);
    //按seller_id查找网店
    List<Store> findStoreBySellerId(Integer seller_id);
    //    删除单条网店
    void  deleteStoreById(Integer id);

}
