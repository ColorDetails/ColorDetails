package com.example.colordetails.service;

import com.example.colordetails.entity.PackagesTypeInfo;
import com.example.colordetails.entity.PayTypeInfo;
import com.example.colordetails.repository.PackagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PackagesServiceImpl implements  PackagesService {

    @Autowired
    private PackagesRepository packagesRepository;
    @Override
    public List<PackagesTypeInfo> getAllWaterType() {
        return packagesRepository.findAll();
    }

    @Override
    public void deleteWaterTypeById(Integer id) {
        packagesRepository.deleteById(id);

    }

    @Override
    public PackagesTypeInfo getWaterTypeById(Integer id) {
        Optional<PackagesTypeInfo> optional=packagesRepository.findById(id);

        return optional.get();
    }

    @Override
    public PackagesTypeInfo addWaterType(PackagesTypeInfo waterTypeInfo) {
        return packagesRepository.save(waterTypeInfo);
    }
}
