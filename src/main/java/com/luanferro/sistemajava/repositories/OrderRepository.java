package com.luanferro.sistemajava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanferro.sistemajava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
