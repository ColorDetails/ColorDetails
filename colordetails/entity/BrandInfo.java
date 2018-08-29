package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BrandInfo {
    @Id
    @GeneratedValue
    private Integer Id;
    private Integer User_Id;
    private String Brand_Name;
    private String About;
    private String Phone;
    private String Legal_Person;
    private String Logo;
    private Integer Company_Id;
    public BrandInfo() {
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

    public String getBrand_Name() {
        return Brand_Name;
    }

    public void setBrand_Name(String brand_Name) {
        Brand_Name = brand_Name;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String about) {
        About = about;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getLegal_Person() {
        return Legal_Person;
    }

    public void setLegal_Person(String legal_Person) {
        Legal_Person = legal_Person;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public Integer getCompany_Id() {
        return Company_Id;
    }

    public void setCompany_Id(Integer company_Id) {
        Company_Id = company_Id;
    }
}
