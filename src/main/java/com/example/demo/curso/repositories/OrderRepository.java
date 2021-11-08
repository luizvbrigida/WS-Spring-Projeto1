	package com.example.demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
