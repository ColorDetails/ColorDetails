package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//单件容量
@Entity
public class CapacityTypeInfo {
    @Id
    @GeneratedValue
    private Integer Id;
    private Integer Ml;

    public CapacityTypeInfo() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getMl() {
        return Ml;
    }

    public void setMl(Integer ml) {
        Ml = ml;
    }
}
