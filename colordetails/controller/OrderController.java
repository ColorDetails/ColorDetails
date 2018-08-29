package com.example.colordetails.controller;
import com.example.colordetails.entity.OrderInfo;
import com.example.colordetails.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.Id;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("Bo-total")
    public String total(Model model){
        List<OrderInfo> orderlist = orderService.getAllOrder();
        model.addAttribute("list",orderlist);
        return "BrandOrder";
    }
    @GetMapping("boadd")
    public String boaddPage(){
        return "BrandBoadd";
    }
    @PostMapping("boadd")
    public String boadd1Page(OrderInfo orderInfo){
        orderService.addOrderInfo(orderInfo);
        return "redirect:/Bo-total";
    }
    @GetMapping("boupdate/{id}")
    public String boupdatePage(@PathVariable("id") Integer id,Model model){
        OrderInfo orderInfo = orderService.getOrdId(id);
        model.addAttribute("bor",orderInfo);
        return "BrandBoUpdate";
    }
    @PostMapping("boupdate")
    public String boupdatePage1(OrderInfo orderInfo){
        orderService.updateOrderInfo(orderInfo);
        return  "redirect:/Bo-total";
    }
    @GetMapping("/bodelete/{id}")
    public String deleteBoID(@PathVariable("id") Integer id){
        orderService.deleteboById(id);
        return  "redirect:/Bo-total";
    }
}
