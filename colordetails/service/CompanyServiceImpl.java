package com.example.colordetails.service;

import com.example.colordetails.entity.CompanyInfo;
import com.example.colordetails.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    //查所有公司
    @Override
    public List<CompanyInfo> findAll() {
        return companyRepository.findAll();
    }
    //根据id删除公司信息
    @Override
    public void deleteById(Integer id) {
        companyRepository.deleteById(id);
    }
    //新增公司信息
    @Override
    public void addCompanyInfo(CompanyInfo companyInfo) {
        companyRepository.save(companyInfo);
    }
    //根据id查公司信息
    @Override
    public CompanyInfo findCompanyInfoById(Integer id) {
        return companyRepository.findById(id).get();
    }

}
