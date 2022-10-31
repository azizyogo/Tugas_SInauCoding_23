package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.Stores;

public interface StoreRepository extends JpaRepository<Stores, Integer> {
    List<Stores> findAllByIsDeleted(boolean isDelete);
}
