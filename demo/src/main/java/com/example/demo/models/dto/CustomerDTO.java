package com.example.demo.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO extends BaseDTO {
    
    private Integer customer_id;

    private String first_name;

    private String last_name;

    private String phone;

    private String email;

    private String street;

    private String city;

    private String state;

    private String zip_code;
}
