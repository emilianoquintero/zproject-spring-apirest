package com.example.zproject_spring_apirest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.zproject_spring_apirest.entities.User;

public interface UserRepository  extends CrudRepository<User, Long>{

}
