package com.example.colordetails.entity;
//支付类型

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PayTypeInfo {
    @Id
    @GeneratedValue
    private Integer Id;
    private String Name;
    public PayTypeInfo() {
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




}
