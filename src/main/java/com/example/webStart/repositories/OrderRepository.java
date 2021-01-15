package com.example.webStart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webStart.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
