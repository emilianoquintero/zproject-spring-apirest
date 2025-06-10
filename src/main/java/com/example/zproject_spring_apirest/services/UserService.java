package com.example.zproject_spring_apirest.services;

import java.util.List;
import java.util.Optional;

import com.example.zproject_spring_apirest.entities.User;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    Optional<User> update(Long id, User user);

    Optional<User> delete(Long id);

    List<User> findByName(String name);
}
