package com.example.demo.models.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "brands")
public class Brands extends BaseEntity {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Integer brand_id;

    @Column(length = 255)
    private String brand_name;

    //Constructor
    // public BrandsEntity() {
    // }

    // public BrandsEntity(@NonNull Integer brand_id, String brand_name) {
    //     this.brand_id = brand_id;
    //     this.brand_name = brand_name;
    // }

    //Get Set
    // public Integer getBrand_id() {
    //     return brand_id;
    // }

    // public void setBrand_id(Integer brand_id) {
    //     this.brand_id = brand_id;
    // }

    // public String getBrand_name() {
    //     return brand_name;
    // }

    // public void setBrand_name(String brand_name) {
    //     this.brand_name = brand_name;
    // }    
    
}
