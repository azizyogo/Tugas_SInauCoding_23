package com.example.demo.models.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name = "orders")
public class orders implements Serializable{

    @Id
    @NonNull
    private Integer order_id;

    // private Integer customer_id;

    @Column(length = 4)
    private byte order_status;

    private java.sql.Date order_date;
    
    private java.sql.Date required_date;
    
    private java.sql.Date shipped_date;

    //Constructor
    public orders() {
    }

    public orders(@NonNull Integer order_id, byte order_status, Date order_date, Date required_date,
            Date shipped_date) {
        this.order_id = order_id;
        this.order_status = order_status;
        this.order_date = order_date;
        this.required_date = required_date;
        this.shipped_date = shipped_date;
    }

    //Get Set
    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public byte getOrder_status() {
        return order_status;
    }

    public void setOrder_status(byte order_status) {
        this.order_status = order_status;
    }

    public java.sql.Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(java.sql.Date order_date) {
        this.order_date = order_date;
    }

    public java.sql.Date getRequired_date() {
        return required_date;
    }

    public void setRequired_date(java.sql.Date required_date) {
        this.required_date = required_date;
    }

    public java.sql.Date getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(java.sql.Date shipped_date) {
        this.shipped_date = shipped_date;
    }

    
    
}
