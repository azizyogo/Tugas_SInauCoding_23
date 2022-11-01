package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.Customers;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {
    List<Customers> findAllByIsDeleted(boolean isDelete);

    // @Query(value = "update customers c set c.first_name = ?, c.last_name = ?, c.phone = ?, c.email = ?, c.street = ?, c.city = ?, c.state = ?, c.zip_code = ?, c.updated_at  = ? where c.customer_id = ?", nativeQuery = true)
    // List<Customers> updateData(@Param() );
    
}
