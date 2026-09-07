package com.example.SpringApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

    @Query(value = "Select p From Product p WHERE p.title = ?1")
    List<Product> findByTitle(String title);
}
