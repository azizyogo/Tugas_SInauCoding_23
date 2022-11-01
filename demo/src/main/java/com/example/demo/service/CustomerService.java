package com.example.demo.service;

import com.example.demo.models.dto.CustomerResDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dto.CustomerDTO;
import com.example.demo.models.entities.Customers;
import com.example.demo.models.mapper.CustomerMapper;
import com.example.demo.repository.CustomerRepository;

import java.util.Date;
import java.util.List;

import javax.persistence.Table;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Transactional(readOnly = true)
    public List<CustomerResDTO> findAll(){
        List<Customers> data = repository.findAllByIsDeleted(false);
        List<CustomerDTO> res =  CustomerMapper.INSTANCE.toDtoList(data);

        return CustomerMapper.INSTANCE.toResCustomer(res);
    }

    @Transactional(readOnly = true)
    public CustomerDTO findById(Integer id){

        Customers data = repository.findById(id).get();

        if(data != null){

            return CustomerMapper.INSTANCE.entityToDto(data);
        }

        return null;
    }

    @Transactional
    public Customers createData(Customers params){
        params.setCreatedDate(new Date());
        params.setDeleted(false);
        return repository.save(params);
    }

    @Transactional()
    public Customers updateData(Customers params, Integer id){

        Customers data = repository.findById(id).get();

        if(data != null){
            data.setFirst_name(params.getFirst_name() != null ? params.getFirst_name() : data.getFirst_name());

            data.setLast_name(params.getLast_name() != null ? params.getLast_name() : data.getLast_name());

            data.setPhone(params.getPhone() != null ? params.getPhone() : data.getPhone());

            data.setEmail(params.getEmail() != null ? params.getEmail() : data.getEmail());

            data.setStreet(params.getStreet() != null ? params.getStreet() : data.getStreet());

            data.setCity(params.getCity() != null ? params.getCity() : data.getCity());

            data.setZip_code(params.getZip_code() != null ? params.getZip_code() : data.getZip_code());

            data.setState(params.getState() != null ? params.getState() : data.getState());

            data.setUpdatedAt(new Date());

            return repository.save(data);
        }

        return null;
    }

    @Transactional()
    public Boolean deleteData(Integer id){
        Customers data = repository.findById(id).get();

        if(data != null){
            data.setDeleted(true);
            
            repository.save(data);

            return true;
        }

        return false;
    }
    
}
