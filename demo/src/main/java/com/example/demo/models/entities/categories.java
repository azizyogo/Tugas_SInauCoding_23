package com.example.demo.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name = "categories")
public class categories implements Serializable {

    @Id
    @NonNull
    private Integer category_id;

    @Column(length = 255)
    private String category_name;

    //Constructor
    public categories() {
    }

    public categories(@NonNull Integer category_id, String category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
    }

    //Get Set
    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    
    
}
