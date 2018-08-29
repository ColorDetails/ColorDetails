package com.example.colordetails.repository;

import com.example.colordetails.entity.CompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//公司信息
public interface CompanyRepository extends JpaRepository<CompanyInfo,Integer> {
    @Query("select c from CompanyInfo c")
    List<CompanyInfo> findAll(Integer id);

}
