package com.example.demo.models.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "categories")
public class Categories extends BaseEntity {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Integer category_id;

    @Column(length = 255)
    private String category_name;

    //Constructor
    // public CategoriesEntity() {
    // }

    // public CategoriesEntity(@NonNull Integer category_id, String category_name) {
    //     this.category_id = category_id;
    //     this.category_name = category_name;
    // }

    // //Get Set
    // public Integer getCategory_id() {
    //     return category_id;
    // }

    // public void setCategory_id(Integer category_id) {
    //     this.category_id = category_id;
    // }

    // public String getCategory_name() {
    //     return category_name;
    // }

    // public void setCategory_name(String category_name) {
    //     this.category_name = category_name;
    // }
       
}
