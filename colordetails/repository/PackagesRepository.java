package com.example.colordetails.repository;

import com.example.colordetails.entity.PackagesTypeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

//包装容量
public interface PackagesRepository extends JpaRepository<PackagesTypeInfo,Integer> {
}
