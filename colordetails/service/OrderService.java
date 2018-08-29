package com.example.colordetails.service;

import com.example.colordetails.entity.OrderInfo;
import org.hibernate.criterion.Order;

import java.util.List;

public interface OrderService {
    List<OrderInfo> getAllOrder();
    OrderInfo addOrderInfo(OrderInfo orderInfo);
    OrderInfo getOraByOrderId(Integer id);
    OrderInfo updateOrderInfo(OrderInfo orderInfo);
    OrderInfo getOrdId(Integer id);
    void deleteboById(Integer id);
}
