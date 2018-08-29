package com.example.colordetails.service;

import com.example.colordetails.entity.PackagesTypeInfo;

import java.util.List;

public interface PackagesService {
    //查包装的全部类型
    List<PackagesTypeInfo> getAllWaterType();
    //根据id删除类型
    void deleteWaterTypeById(Integer id);
    //根据id查找类型
    PackagesTypeInfo getWaterTypeById(Integer id);
    //添加类型
    PackagesTypeInfo addWaterType(PackagesTypeInfo waterTypeInfo);
}
