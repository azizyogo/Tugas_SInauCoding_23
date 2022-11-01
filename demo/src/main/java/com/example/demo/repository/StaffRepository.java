package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.Staffs;

public interface StaffRepository extends JpaRepository<Staffs, Integer> {
    List<Staffs> findAllByIsDeleted(boolean isDelete);
}
