package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findAllByIsDeleted(boolean isDelete);
}
