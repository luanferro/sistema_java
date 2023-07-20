package com.luanferro.sistemajava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanferro.sistemajava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
