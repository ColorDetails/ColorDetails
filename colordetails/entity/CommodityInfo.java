package com.example.colordetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//商品信息
@Entity
public class CommodityInfo {
    @Id
    @GeneratedValue
    private Integer Id;
    private String Name;
    private Float Price;
    private Integer Number;
    private String Details;
    private Date Create_time;
    private String Image;
    private Integer Quality_Time;
    private Date Product_Time;
    private Integer State;
    private Integer Capacity_Id;
    private Integer Packages_Id;
    private Integer WaterType_Id;
    private Integer Brand_Id;

    public Integer getBrand_Id() {
        return Brand_Id;
    }

    public void setBrand_Id(Integer brand_Id) { Brand_Id = brand_Id; }


    public Integer getWaterType_Id() {
        return WaterType_Id;
    }

    public void setWaterType_Id(Integer waterType_Id) {
        WaterType_Id = waterType_Id;
    }

    public CommodityInfo() {
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

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public Date getCreate_time() {
        return Create_time;
    }

    public void setCreate_time(Date create_time) {
        Create_time = create_time;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Integer getQuality_Time() {
        return Quality_Time;
    }

    public void setQuality_Time(Integer quality_Time) {
        Quality_Time = quality_Time;
    }

    public Date getProduct_Time() {
        return Product_Time;
    }

    public void setProduct_Time(Date product_Time) {
        Product_Time = product_Time;
    }

    public Integer getState() {
        return State;
    }

    public void setState(Integer state) {
        State = state;
    }

    public Integer getCapacity_Id() {
        return Capacity_Id;
    }

    public void setCapacity_Id(Integer capacity_Id) {
        Capacity_Id = capacity_Id;
    }

    public Integer getPackages_Id() {
        return Packages_Id;
    }

    public void setPackages_Id(Integer packages_Id) {
        Packages_Id = packages_Id;
    }
}
