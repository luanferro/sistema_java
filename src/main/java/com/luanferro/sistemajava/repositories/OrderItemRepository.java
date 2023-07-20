package com.luanferro.sistemajava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanferro.sistemajava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
