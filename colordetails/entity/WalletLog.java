package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//钱包日志
@Entity
public class WalletLog {
    @Id
    @GeneratedValue
    private Integer Id;
    private Integer Order_Id;
    private Double Price;

    public WalletLog() {
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

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Date getCreate_Time() {
        return Create_Time;
    }

    public void setCreate_Time(Date create_Time) {
        Create_Time = create_Time;
    }

    private Date Create_Time;
}
