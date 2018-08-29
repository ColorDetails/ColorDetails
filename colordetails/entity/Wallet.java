package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//钱包
@Entity
public class Wallet {
    @Id
    @GeneratedValue
    private Integer Id;
    private Integer User_Id;
    private Float  Money;
    private Date Last_Time;
    private String Pay_Password;

    public String getPay_Password() {
        return Pay_Password;
    }

    public void setPay_Password(String pay_Password) {
        Pay_Password = pay_Password;
    }

    public Wallet() {
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

    public Float getMoney() {
        return Money;
    }

    public void setMoney(Float money) {
        Money = money;
    }

    public Date getLast_Time() {
        return Last_Time;
    }

    public void setLast_Time(Date last_Time) {
        Last_Time = last_Time;
    }
}
