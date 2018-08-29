package com.example.colordetails.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Store {
    @Id
    @GeneratedValue
    private Integer Id;
    private String Name;
    private String Brief_Info;
    private String Store_Logo;
    private Integer Seller_Id;

    public Integer getSeller_Id() {
        return Seller_Id;
    }

    public void setSeller_Id(Integer seller_Id) {
        Seller_Id = seller_Id;
    }


    public Store() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrief_Info() {
        return Brief_Info;
    }

    public void setBrief_Info(String brief_Info) {
        Brief_Info = brief_Info;
    }

    public String getStore_Logo() {
        return Store_Logo;
    }

    public void setStore_Logo(String store_Logo) {
        Store_Logo = store_Logo;
    }
}
