package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderInfo {

    @Id
    @GeneratedValue
    private Integer Id;
    private Integer Customer_Id;
    private Integer Seller_Id;
    private Double Total_Price;
    private Integer Pay_Id;
    private Integer State;

    public OrderInfo() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCustomer_Id() {
        return Customer_Id;
    }

    public void setCustomer_Id(Integer customer_Id) {
        Customer_Id = customer_Id;
    }

    public Integer getSeller_Id() {
        return Seller_Id;
    }

    public void setSeller_Id(Integer seller_Id) {
        Seller_Id = seller_Id;
    }

    public Double getTotal_Price() {
        return Total_Price;
    }

    public void setTotal_Price(Double total_Price) {
        Total_Price = total_Price;
    }

    public Integer getPay_Id() {
        return Pay_Id;
    }

    public void setPay_Id(Integer pay_Id) {
        Pay_Id = pay_Id;
    }

    public Integer getState() {
        return State;
    }

    public void setState(Integer state) {
        State = state;
    }
}
