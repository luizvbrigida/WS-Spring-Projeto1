package com.example.demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
