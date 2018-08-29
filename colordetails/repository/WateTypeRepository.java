package com.example.colordetails.repository;

import com.example.colordetails.entity.WaterTypeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//获取所有类型
public interface WateTypeRepository extends JpaRepository<WaterTypeInfo,Integer> {
}
