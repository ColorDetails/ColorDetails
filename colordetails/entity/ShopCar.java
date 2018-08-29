package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//购物车
@Entity
public class ShopCar {
    @Id
    @GeneratedValue
    private Integer Id;

    public ShopCar() {
    }

    private  String Seller_Id;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSeller_Id() {
        return Seller_Id;
    }

    public void setSeller_Id(String seller_Id) {
        Seller_Id = seller_Id;
    }

}
