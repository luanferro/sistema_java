package com.luanferro.sistemajava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanferro.sistemajava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
