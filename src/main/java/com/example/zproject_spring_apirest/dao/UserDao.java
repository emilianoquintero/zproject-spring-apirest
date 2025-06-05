package com.example.zproject_spring_apirest.dao;

// The interface indicates what functions will have or use a Class 

import java.util.List;

import org.springframework.stereotype.Repository;

import models.User;

// This obligate or indicate the need of use of those Classes
@Repository
public interface UserDao {

    List<User> getUsers();
    
}
