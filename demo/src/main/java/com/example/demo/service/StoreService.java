package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.entities.Stores;
import com.example.demo.repository.StoreRepository;

import java.util.Date;
import java.util.List;

@Service
public class StoreService {
    
    @Autowired
    private StoreRepository repository;

    @Transactional(readOnly = true)
    public List<Stores> findAll(){
        List<Stores> data = repository.findAllByIsDeleted(false);
        
        return data;
    }

    @Transactional(readOnly = true)
    public Stores findById(Integer id){

        Stores data = repository.findById(id).get();

        if(data != null){

            return data;
        }

        return null;
    }

    @Transactional
    public Stores createData(Stores params){
        params.setCreatedDate(new Date());
        params.setDeleted(false);
        return repository.save(params);
    }

    @Transactional()
    public Stores updateData(Stores params, Integer id){

        Stores data = repository.findById(id).get();

        if(data != null){
            data.setStore_name(params.getStore_name() != null ? params.getStore_name() : data.getStore_name());

            data.setPhone(params.getPhone() != null ? params.getPhone() : data.getPhone());

            data.setEmail(params.getEmail() != null ? params.getEmail() : data.getEmail());

            data.setStreet(params.getStreet() != null ? params.getStreet() : data.getStreet());

            data.setCity(params.getCity() != null ? params.getCity() : data.getCity());

            data.setState(params.getState() != null ? params.getState() : data.getState());

            data.setZip_code(params.getZip_code() != null ? params.getZip_code() : data.getZip_code());

            data.setUpdatedAt(new Date());

            return repository.save(data);
        }

        return null;
    }

    @Transactional()
    public Boolean deleteData(Integer id){
        Stores data = repository.findById(id).get();

        if(data != null){
            data.setDeleted(true);
            
            repository.save(data);

            return true;
        }

        return false;
    }
}
