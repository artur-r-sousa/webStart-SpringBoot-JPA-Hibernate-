package com.example.webStart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webStart.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
