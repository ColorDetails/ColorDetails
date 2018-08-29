package com.example.colordetails.service;

import com.example.colordetails.entity.Store;
import com.example.colordetails.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreRepository StoreRepository;
    @Override
    public List<Store> findAllStore() {
        return StoreRepository.findAllStore();
    }

    @Override
    public Store updateStore(Store Store) {
        return StoreRepository.save(Store);
    }

    @Override
    public Store addStore(Store Store) {
        return StoreRepository.save(Store);
    }

    @Override
    public Store findStoreById(Integer id) {
        return StoreRepository.findStoreById(id);
    }

    @Override
    public List<Store> findStoreBySellerId(Integer seller_id) {
        return StoreRepository.findStoreBySellerId(seller_id);
    }

    @Override
    public void deleteStoreById(Integer id) {
        StoreRepository.deleteById(id);
    }


}
