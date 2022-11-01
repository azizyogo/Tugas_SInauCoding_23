package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.entities.Staffs;
import com.example.demo.repository.StaffRepository;

import java.util.Date;
import java.util.List;

@Service
public class StaffService {
    
    @Autowired
    private StaffRepository repository;

    @Transactional(readOnly = true)
    public List<Staffs> findAll(){
        List<Staffs> data = repository.findAllByIsDeleted(false);

        return data;
    }

    @Transactional(readOnly = true)
    public Staffs findById(Integer id){

        Staffs data = repository.findById(id).get();

        if(data != null){

            return data;
        }

        return null;
    }

    @Transactional()
    public Staffs createData(Staffs params){
        params.setCreatedDate(new Date());
        params.setDeleted(false);
        return repository.save(params);
    }

    @Transactional()
    public Staffs updateData(Staffs params, Integer id){

        Staffs data = repository.findById(id).get();

        if(data != null){
            data.setFirst_name(params.getFirst_name() != null ? params.getFirst_name() : data.getFirst_name());

            data.setLast_name(params.getLast_name() != null ? params.getLast_name() : data.getLast_name());

            data.setEmail(params.getEmail() != null ? params.getEmail() : data.getEmail());
            
            data.setPhone(params.getPhone() != null ? params.getPhone() : data.getPhone());

            data.setActive(params.getActive() != 0 ? params.getActive() : data.getActive());

            data.setUpdatedAt(new Date());

            return repository.save(data);
        }

        return null;
    }

    @Transactional()
    public Boolean deleteData(Integer id){
        Staffs data = repository.findById(id).get();

        if(data != null){
            data.setDeleted(true);
            
            repository.save(data);

            return true;
        }

        return false;
    }
}
