package com.example.zproject_spring_apirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.zproject_spring_apirest.entities.User;
import com.example.zproject_spring_apirest.repositories.UserRepository;

// Service is a @component wich determinate the business service facade 
@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository repository;

    @Override
    @Transactional(readOnly= true)
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    @Transactional(readOnly= true)
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public Optional<User> delete(User user) {
        Optional<User> userOptional = repository.findById(user.getId());
        userOptional.ifPresent(userDb -> {
            repository.delete(userDb);
        });
        return userOptional;
    }

}
