package com.example.colordetails.service;

import com.example.colordetails.entity.CapacityTypeInfo;

import java.util.List;

public interface CapacityService {
    //查单件容量的全部类型
    List<CapacityTypeInfo> getAllWaterType();
    //根据id删除类型
    void deleteWaterTypeById(Integer id);
    //根据id查找类型
    CapacityTypeInfo getWaterTypeById(Integer id);
    //添加类型
    CapacityTypeInfo addWaterType(CapacityTypeInfo waterTypeInfo);
}
