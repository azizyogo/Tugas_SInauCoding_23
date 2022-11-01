package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.Brands;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brands, Integer> {
    List<Brands> findAllByIsDeleted(boolean isDelete);
}
