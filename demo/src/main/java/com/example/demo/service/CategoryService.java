package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.entities.Categories;
import com.example.demo.repository.CategoryRepository;

import java.util.Date;
import java.util.List;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<Categories> findAll(){
        List<Categories> data = repository.findAllByIsDeleted(false);

        return data;
    }

    @Transactional(readOnly = true)
    public Categories findById(Integer id){

        Categories data = repository.findById(id).get();

        if(data != null){

            return data;
        }

        return null;
    }

    @Transactional
    public Categories createData(Categories params){
        params.setCreatedDate(new Date());
        params.setDeleted(false);
        return repository.save(params);
    }

    @Transactional()
    public Categories updateData(Categories params, Integer id){

        Categories data = repository.findById(id).get();

        if(data != null){
            data.setCategory_name(params.getCategory_name() != null ? params.getCategory_name() : data.getCategory_name());

            data.setUpdatedAt(new Date());

            return repository.save(data);
        }

        return null;
    }

    @Transactional()
    public Boolean deleteData(Integer id){
        Categories data = repository.findById(id).get();

        if(data != null){
            data.setDeleted(true);
            
            repository.save(data);

            return true;
        }

        return false;
    }

}
