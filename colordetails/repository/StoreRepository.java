package com.example.colordetails.repository;

import com.example.colordetails.entity.Store;
import com.example.colordetails.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//网店信息表
public interface StoreRepository extends JpaRepository<Store,Integer>{
    //网店管理
    //查询网店信息
    @Query(value = "SELECT  * FROM store",nativeQuery = true)
    List<Store> findAllStore();
    //根据Id查询网店
    @Query(value = "SELECT  * FROM store WHERE id=?1",nativeQuery = true)
    Store findStoreById(Integer id);
    //根据seller_id查询网店
    @Query(value = "SELECT * FROM store WHERE seller_id=?1",nativeQuery = true)
    List<Store> findStoreBySellerId(Integer seller_id);


}
