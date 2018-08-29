package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//公司信息
@Entity
public class CompanyInfo {
    @Id
    @GeneratedValue
    private Integer Id;
    private String Name;
    private String About;
    private String Legal_Person;
    private String Address;
    private String Phone;
    private String Logo;

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", About='" + About + '\'' +
                ", Legal_Person='" + Legal_Person + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Logo='" + Logo + '\'' +
                '}';
    }

    public CompanyInfo() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String about) {
        About = about;
    }

    public String getLegal_Person() {
        return Legal_Person;
    }

    public void setLegal_Person(String legal_Person) {
        Legal_Person = legal_Person;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }
}
