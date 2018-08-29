package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderDetails {

    @Id
    @GeneratedValue
    private Integer Id;
    private Integer Order_Id;
    private Integer Commodity_Id;
    private Integer Number;
    private Double Price;
    private Double Total_Price;

    public OrderDetails() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getOrder_Id() {
        return Order_Id;
    }

    public void setOrder_Id(Integer order_Id) {
        Order_Id = order_Id;
    }

    public Integer getCommodity_Id() {
        return Commodity_Id;
    }

    public void setCommodity_Id(Integer commodity_Id) {
        Commodity_Id = commodity_Id;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getTotal_Price() {
        return Total_Price;
    }

    public void setTotal_Price(Double total_Price) {
        Total_Price = total_Price;
    }
}
