package com.example.colordetails.service;
import com.example.colordetails.entity.BrandInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface BrandService {
    //查找所有品牌商信息
    List<BrandInfo> findAllBrand();
    //根据id删除品牌商信息
    void deleteBrandById(Integer id);
    //增加品牌商信息
    BrandInfo addBrandInfo(BrandInfo brandInfo);
    //更新品牌商信息
    BrandInfo updateBrandInfo(BrandInfo brandInfo);
    //根据id查找品牌商信息
    BrandInfo findBrandById(Integer id);
    //根据user_id查找品牌商信息
    BrandInfo findBrandByUserId(Integer id);
    //分页功能
    Page<BrandInfo> findAllBrandByPage(Pageable pageable);
}
