package com.luanferro.sistemajava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanferro.sistemajava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
