package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//借卖商信息表
@Entity
public class SellerInfo {
    @Id
    @GeneratedValue
    private Integer Id;
    private Integer User_Id;
    private String Seller_Name;
    private String Phone;

    public SellerInfo() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(Integer user_Id) {
        User_Id = user_Id;
    }

    public String getSeller_Name() {
        return Seller_Name;
    }

    public void setSeller_Name(String seller_Name) {
        Seller_Name = seller_Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
