package com.example.demo.models.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "stores")
public class Stores extends BaseEntity{
    
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer store_id;

    private String store_name;

    @Column(length = 25)
    private String phone;

    private String email;

    private String street;
    
    private String city;

    @Column(length = 10)
    private String state;

    @Column(length = 5)
    private String zip_code;

    // //Constructor
    // public StoresEntity() {
    // }

    // public StoresEntity(@NonNull Integer store_id, String store_name, String phone, String email, String street, String city,
    //         String state, String zip_code) {
    //     this.store_id = store_id;
    //     this.store_name = store_name;
    //     this.phone = phone;
    //     this.email = email;
    //     this.street = street;
    //     this.city = city;
    //     this.state = state;
    //     this.zip_code = zip_code;
    // }

    // //Get Set
    // public Integer getStore_id() {
    //     return store_id;
    // }

    // public void setStore_id(Integer store_id) {
    //     this.store_id = store_id;
    // }

    // public String getStore_name() {
    //     return store_name;
    // }

    // public void setStore_name(String store_name) {
    //     this.store_name = store_name;
    // }

    // public String getPhone() {
    //     return phone;
    // }

    // public void setPhone(String phone) {
    //     this.phone = phone;
    // }

    // public String getEmail() {
    //     return email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    // public String getStreet() {
    //     return street;
    // }

    // public void setStreet(String street) {
    //     this.street = street;
    // }

    // public String getCity() {
    //     return city;
    // }

    // public void setCity(String city) {
    //     this.city = city;
    // }

    // public String getState() {
    //     return state;
    // }

    // public void setState(String state) {
    //     this.state = state;
    // }

    // public String getZip_code() {
    //     return zip_code;
    // }

    // public void setZip_code(String zip_code) {
    //     this.zip_code = zip_code;
    // }

}
