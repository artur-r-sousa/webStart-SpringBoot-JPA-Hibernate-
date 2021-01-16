package com.example.webStart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webStart.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
