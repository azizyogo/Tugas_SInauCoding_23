package com.example.demo.models.mapper;

import com.example.demo.models.entities.*;
import com.example.demo.models.dto.*;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    Customers dtoToEntity(CustomerDTO dto);

    CustomerDTO entityToDto(Customers param);

    List<Customers> toEntityList(List<CustomerDTO> data);

    List<CustomerDTO> toDtoList(List<Customers> data);

    CustomerResDTO fromCustomerToCustome(CustomerDTO param);

    List<CustomerResDTO> toResCustomer(List<CustomerDTO> data);
    
}
