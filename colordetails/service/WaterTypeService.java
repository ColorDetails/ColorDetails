package com.example.colordetails.service;

import com.example.colordetails.entity.WaterTypeInfo;

import java.util.List;

public interface WaterTypeService {
    //查全部水的类型
    List<WaterTypeInfo> getAllWaterType();
    //根据id删除类型
    void deleteWaterTypeById(Integer id);
    //根据id查找类型
    WaterTypeInfo getWaterTypeById(Integer id);
    //添加类型
    WaterTypeInfo addWaterType(WaterTypeInfo waterTypeInfo);

}
