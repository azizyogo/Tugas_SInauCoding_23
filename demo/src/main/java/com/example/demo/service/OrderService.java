package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.entities.Orders;
import com.example.demo.repository.OrderRepository;
import com.example.helper.*;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<Orders> findAll(){
        List<Orders> data = repository.findAllByIsDeleted(false);
        
        return data;
    }
    
    @Transactional(readOnly = true)
    public Orders findById(Integer id){

        Orders data = repository.findById(id).get();

        if(data != null){

            return data;
        }

        return null;
    }

    @Transactional
    public Orders createData(Orders params){
        params.setCreatedDate(new Date());
        params.setDeleted(false);
        params.setOrder_date(new Date());
        params.setRequired_date(new Date());
        params.setShipped_date(new Date());
        return repository.save(params);
    }

    @Transactional()
    public Orders updateData(Orders params, Integer id){

        Orders data = repository.findById(id).get();

        if(data != null){

            data.setOrder_status(params.getOrder_status() == 0 || params.getOrder_status() == 1 ? params.getOrder_status() : data.getOrder_status());

            data.setOrder_date(params.getOrder_date() != null ? params.getOrder_date() : data.getOrder_date());
            
            data.setRequired_date(params.getOrder_date() != null ? params.getRequired_date() : data.getRequired_date());

            data.setShipped_date(params.getShipped_date() != null ? params.getShipped_date() : data.getShipped_date());

            data.setUpdatedAt(new Date());

            return repository.save(data);
        }

        return null;
    }

    @Transactional()
    public Boolean deleteData(Integer id){
        Orders data = repository.findById(id).get();

        if(data != null){
            data.setDeleted(true);
            
            repository.save(data);

            return true;
        }

        return false;
    }
}
