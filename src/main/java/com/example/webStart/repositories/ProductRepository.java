package com.example.webStart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webStart.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
