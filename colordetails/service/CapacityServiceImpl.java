package com.example.colordetails.service;

import com.example.colordetails.entity.CapacityTypeInfo;
import com.example.colordetails.repository.CapacityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapacityServiceImpl implements CapacityService {
    @Autowired
    private CapacityRepository capacityRepository;
    @Override
    public List<CapacityTypeInfo> getAllWaterType() {
        return capacityRepository.findAll();
    }

    @Override
    public void deleteWaterTypeById(Integer id) {
        capacityRepository.deleteById(id);

    }
    @Override
    public CapacityTypeInfo getWaterTypeById(Integer id) {
        Optional<CapacityTypeInfo> optional=capacityRepository.findById(id);
        return optional.get();
    }
    @Override
    public CapacityTypeInfo addWaterType(CapacityTypeInfo waterTypeInfo) {
        return capacityRepository.save(waterTypeInfo);
    }
}
