package com.example.demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.curso.entities.User;

public interface userRepository extends JpaRepository<User, Long> {

	
}
