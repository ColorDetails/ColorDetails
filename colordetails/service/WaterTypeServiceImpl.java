package com.example.colordetails.service;

import com.example.colordetails.entity.WaterTypeInfo;
import com.example.colordetails.repository.WateTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WaterTypeServiceImpl implements WaterTypeService {
    @Autowired private WateTypeRepository wateTypeRepository;
    @Override
    public List<WaterTypeInfo> getAllWaterType() {
        return wateTypeRepository.findAll();
    }

    @Override
    public void deleteWaterTypeById(Integer id) {
        wateTypeRepository.deleteById(id);

    }

    @Override
    public WaterTypeInfo getWaterTypeById(Integer id) {
        Optional<WaterTypeInfo> optional=wateTypeRepository.findById(id);
        return optional.get();
    }

    @Override
    public WaterTypeInfo addWaterType(WaterTypeInfo waterTypeInfo) {
        return wateTypeRepository.save(waterTypeInfo);
    }
}
