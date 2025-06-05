package com.example.zproject_spring_apirest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "firstname")
    private String firstName;
    @Getter @Setter @Column(name = "secondname")
    private String secondName;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "phonenumber")
    private String phoneNumber;
    
}
