package com.example.colordetails.repository;

import com.example.colordetails.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Id;
import java.util.List;

public interface OrderRepository extends JpaRepository<OrderInfo,Integer> {
    @Query("select o from OrderInfo o")
    List<OrderInfo> findAllOrd();
    @Query(value = "select * from order_info where  order_info.id=?1",nativeQuery = true)
    OrderInfo getOrdId(Integer id);

}
