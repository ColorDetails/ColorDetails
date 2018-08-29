package com.example.colordetails.service;

import com.example.colordetails.entity.OrderInfo;
import com.example.colordetails.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderInfo> getAllOrder() {
        return orderRepository.findAllOrd();
    }

    @Override
    public OrderInfo addOrderInfo(OrderInfo orderInfo) {
        return orderRepository.save(orderInfo);
    }

    @Override
    public OrderInfo getOraByOrderId(Integer id) {
        Optional<OrderInfo> opof=orderRepository.findById(id);
        return opof.get();
    }

    @Override
    public OrderInfo updateOrderInfo(OrderInfo orderInfo) {
        return orderRepository.save(orderInfo);
    }

    @Override
    public OrderInfo getOrdId(Integer id) {

        return orderRepository.getOrdId(id);

    }

    @Override
    public void deleteboById(Integer id) {
         orderRepository.deleteById(id);
    }

}
