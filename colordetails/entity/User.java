package com.example.colordetails.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//用户表
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer Id;
    private String User_Name;
    private String Password;
    private String User_Type;

    public User() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String user_Type) {
        User_Type = user_Type;
    }


}
