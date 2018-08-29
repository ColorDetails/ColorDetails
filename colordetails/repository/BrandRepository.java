package com.example.colordetails.repository;

import com.example.colordetails.entity.BrandInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandRepository extends JpaRepository<BrandInfo,Integer> {
    @Query(value = "SELECT * FROM brand_info b WHERE user_id=?1" ,nativeQuery = true)
    BrandInfo findBrandByUserId(Integer id);

}
