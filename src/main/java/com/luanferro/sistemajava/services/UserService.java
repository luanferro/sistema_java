package com.luanferro.sistemajava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.luanferro.sistemajava.entities.User;
import com.luanferro.sistemajava.repositories.UserRepository;
import com.luanferro.sistemajava.services.exceptions.DatabaseException;
import com.luanferro.sistemajava.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
    
    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id){
        try {
            repository.deleteById(id); 
        } catch(EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch(DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
       
    }

    public User update(Long id, User obj) {
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
    
}
