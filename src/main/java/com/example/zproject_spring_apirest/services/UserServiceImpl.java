package com.example.zproject_spring_apirest.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.zproject_spring_apirest.entities.User;
import com.example.zproject_spring_apirest.repositories.UserRepository;

// Service is a @component wich determinate the business service facade 
@Service
public class UserServiceImpl implements  UserService{
        private static final Logger logger = LoggerFactory.getLogger(DebtService.class);

    // @AUTOWIRED is a Spring annotation that allows automatic dependency injection in your application.  
    // Spring looks for an instance of the required class and injects it automatically.

    @Autowired
    private UserRepository repository;

    // @OVERRIDE Indicates that the findAll() method is overriding (redefining) a method from a parent class or interface.
    // findAll() is implementing a method defined in JpaRepository or a custom interface.

    // @TRANSACTIONAL Indicates that this operation is within a database transaction in Spring.
    // readOnly = true optimizes the query because it tells Hibernate that no changes will be made to the database.

    @Override
    @Transactional(readOnly= true)
    public List<User> findAll() {
        logger.info("Obteniendo informacion de base de datos");
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
    public Optional<User> update(Long id, User user) {
        Optional<User> userOptional = repository.findById(id);
        if(userOptional.isPresent()) {
            User userDb = userOptional.orElseThrow();

            userDb.setFirstName(user.getFirstName());
            userDb.setSecondName(user.getSecondName());
            userDb.setEmail(user.getEmail());
            userDb.setPhoneNumber(user.getPhoneNumber());
            userDb.setAge(user.getAge());
            return Optional.of(repository.save(userDb));
        };
        return userOptional;
    }

    @Override
    @Transactional
    public Optional<User> delete(Long id) {
        Optional<User> userOptional = repository.findById(id);
        userOptional.ifPresent(userDb -> {
            repository.delete(userDb);
        });
        return userOptional;
    }

    @Override
    @Transactional(readOnly= true)
    public List<User> findByName(String name) {
        return repository.findByName(name);
    }

}
