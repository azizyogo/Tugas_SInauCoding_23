package com.example.demo.models.entities;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    private Date createdDate;
    private Date updatedAt;
    private boolean isDeleted;
    
}
