package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class AdminInfo {
    @Id
    @GeneratedValue
    private Integer Id;
    private Integer User_Id;
    private Integer Level;
    private Date Last_Login_Time;

    public AdminInfo() {
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

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public Date getLast_Login_Time() {
        return Last_Login_Time;
    }

    public void setLast_Login_Time(Date last_Login_Time) {
        Last_Login_Time = last_Login_Time;
    }
}
