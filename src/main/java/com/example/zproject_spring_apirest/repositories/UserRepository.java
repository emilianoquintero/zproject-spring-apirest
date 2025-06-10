package com.example.zproject_spring_apirest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.zproject_spring_apirest.entities.User;

public interface UserRepository  extends CrudRepository<User, Long>{
// public interface UserRepository  extends JpaRepository<User, Long>{

    @Query("SELECT u FROM User u WHERE u.firstName = :name")    
    List<User> findByName(@Param("name") String name);

}
