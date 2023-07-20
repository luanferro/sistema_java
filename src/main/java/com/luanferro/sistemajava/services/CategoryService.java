package com.luanferro.sistemajava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luanferro.sistemajava.entities.Category;
import com.luanferro.sistemajava.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
    
    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
    
}
