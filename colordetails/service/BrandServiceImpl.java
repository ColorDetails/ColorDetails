package com.example.colordetails.service;
import com.example.colordetails.entity.BrandInfo;
import com.example.colordetails.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;
    //查询所有品牌
    @Override
    public List<BrandInfo> findAllBrand() {
        return brandRepository.findAll();
    }
    @Override
    public void deleteBrandById(Integer id) {
        brandRepository.deleteById(id);

    }
    @Override
    public BrandInfo addBrandInfo(BrandInfo brandInfo) {
        return brandRepository.save(brandInfo);
    }

    @Override
    public BrandInfo updateBrandInfo(BrandInfo brandInfo) {
        return brandRepository.save(brandInfo);
    }

    @Override
    public BrandInfo findBrandById(Integer id) {
        return brandRepository.findById(id).get();
    }

    @Override
    public BrandInfo findBrandByUserId(Integer id) {
        return brandRepository.findBrandByUserId(id);
    }

    @Override
    public Page<BrandInfo> findAllBrandByPage(Pageable pageable) {
        return brandRepository.findAll(pageable);
    }
    //分页功能


}









