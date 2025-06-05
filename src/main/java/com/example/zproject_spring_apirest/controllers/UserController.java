package com.example.zproject_spring_apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zproject_spring_apirest.dao.UserDao;

import models.User;

@RestController
@Controller
@CrossOrigin(origins = "**")
public class UserController {

    // @Autowired It's a way of telling Spring that it must provide an instance of a bean without us having to create it manually.
    // @Autowired Spring looks for a bean of the corresponding type in the application context and automatically injects it.
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "users")
    public List<User> getUsers() {
        return userDao.getUsers();
    }
    
    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setFirstName("Emiliano");
        user.setSecondName("Quintero");
        user.setEmail("qb.emiliano@gmail.com");
        user.setPhoneNumber("6671064658");
        return user;
    }

    
}
