package com.example.colordetails.repository;

import com.example.colordetails.entity.CapacityTypeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

//单件容量
public interface CapacityRepository extends JpaRepository<CapacityTypeInfo,Integer> {
}
