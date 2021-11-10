package com.example.demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
