package com.example.colordetails.repository;

import com.example.colordetails.entity.SellerInfo;
import com.example.colordetails.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//借卖商信息表
public interface SellerRepository extends JpaRepository<SellerInfo,Integer>{
    //    //查询所有借卖方信息
    @Query(value = "SELECT * FROM seller_info",nativeQuery = true)
    List<SellerInfo> findAllSeller();
    //查询借卖方信息，按id
    @Query(value = "SELECT  * FROM seller_info WHERE id=?1",nativeQuery = true)
    SellerInfo findSellerById(Integer id);
    //查询借卖方信息,按user_id
    @Query(value = "SELECT * FROM seller_info WHERE user_id=?1 ",nativeQuery = true)
    SellerInfo findSellerByUser_Id(Integer user_id);



//    //网店管理
//    //查询网店信息
//    @Query(value = "SELECT  * FROM store",nativeQuery = true)
//    List<Store> findAllStore();
//
//    @Query(value = "SELECT  * FROM store WHERE id=?1",nativeQuery = true)
//    Store findByStoreId(Integer id);


}
