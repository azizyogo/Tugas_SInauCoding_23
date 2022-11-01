package com.example.demo.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResDTO {

    private Integer customer_id;

    private String first_name;

    private String last_name;

    private String phone;

    private String email;
    
}
