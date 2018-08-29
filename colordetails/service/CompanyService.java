package com.example.colordetails.service;

import com.example.colordetails.entity.CompanyInfo;

import java.util.List;

public interface CompanyService {
    //查询所有公司信息
    List<CompanyInfo> findAll();
    //根据id删除公司信息
    void deleteById(Integer id);
    //增加公司信息
    void addCompanyInfo(CompanyInfo companyInfo);
    //根据id查公司信息
    CompanyInfo findCompanyInfoById(Integer id);
}
