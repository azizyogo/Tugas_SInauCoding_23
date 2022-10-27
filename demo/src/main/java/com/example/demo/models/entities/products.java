package com.example.demo.models.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name = "products")
public class products implements Serializable {

    @Id
    @NonNull
    private Integer product_id;

    private String product_name;

    @Column(length = 6)
    private Short model_year;

    @Column(precision = 10, scale = 2)
    private java.math.BigDecimal list_price;

    @ManyToOne
    @Column(name = "category_id")
    private categories categories;

    //Constructor
    public products() {
    }

    public products(@NonNull Integer product_id, String product_name, Short model_year, BigDecimal list_price,
            com.example.demo.models.entities.categories categories) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.model_year = model_year;
        this.list_price = list_price;
        this.categories = categories;
    }

    //Get Set
    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Short getModel_year() {
        return model_year;
    }

    public void setModel_year(Short model_year) {
        this.model_year = model_year;
    }

    public java.math.BigDecimal getList_price() {
        return list_price;
    }

    public void setList_price(java.math.BigDecimal list_price) {
        this.list_price = list_price;
    }

    public categories getCategories() {
        return categories;
    }

    public void setCategories(categories categories) {
        this.categories = categories;
    }
    
    
}
