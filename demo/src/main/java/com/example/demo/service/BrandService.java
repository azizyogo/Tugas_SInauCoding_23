package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.entities.Brands;
import com.example.demo.repository.BrandRepository;

import java.util.Date;
import java.util.List;

@Service
public class BrandService {
    
    @Autowired
    private BrandRepository repository;

    @Transactional(readOnly = true)
    public List<Brands> findAll(){
        List<Brands> data = repository.findAllByIsDeleted(false);
        
        return data;
    }

    @Transactional(readOnly = true)
    public Brands findById(Integer id){

        Brands data = repository.findById(id).get();

        if(data != null){

            return data;
        }

        return null;
    }

    @Transactional
    public Brands createData(Brands params){
        params.setCreatedDate(new Date());
        params.setDeleted(false);
        return repository.save(params);
    }

    @Transactional()
    public Brands updateData(Brands params, Integer id){

        Brands data = repository.findById(id).get();

        if(data != null){
            data.setBrand_name(params.getBrand_name() != null ? params.getBrand_name() : data.getBrand_name());

            data.setUpdatedAt(new Date());

            return repository.save(data);
        }

        return null;
    }

    @Transactional()
    public Boolean deleteData(Integer id){
        Brands data = repository.findById(id).get();

        if(data != null){
            data.setDeleted(true);
            
            repository.save(data);

            return true;
        }

        return false;
    }


}
