package com.example.demo.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name = "staffs")
public class staffs implements Serializable {

    @Id
    @NonNull
    private Integer staff_id;

    @Column(length = 50)
    private String first_name;

    @Column(length = 50)
    private String last_name;
    
    private String email;

    @Column(length = 25)
    private String phone;

    private byte active;

    //Constructor
    public staffs() {
    }

    public staffs(@NonNull Integer staff_id, String first_name, String last_name, String email, String phone,
            byte active) {
        this.staff_id = staff_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.active = active;
    }

    //Get Set
    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    
    
}
