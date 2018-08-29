package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//单件容量
@Entity
public class PackagesTypeInfo {

    @Id
    @GeneratedValue
    private Integer Id;
    private Integer Number;

    public PackagesTypeInfo() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }
}
