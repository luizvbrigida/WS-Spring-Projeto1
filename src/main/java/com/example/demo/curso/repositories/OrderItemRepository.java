package com.example.demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
