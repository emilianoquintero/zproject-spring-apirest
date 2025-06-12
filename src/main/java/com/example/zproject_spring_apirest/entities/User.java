package com.example.zproject_spring_apirest.entities;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
public class User {

    // The validation message are configurated with de lenguage of the time zone.

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @NotEmpty(message="{NotEmpty.user.firstname}")
    @Size(min=2, max=14)
    @Getter @Setter @Column(name = "firstname")
    private String firstName;

    @NotEmpty(message="{NotEmpty.user.secondname}")
    @Size(min=2, max=14)
    @Getter @Setter @Column(name = "secondname")
    private String secondName;

    @NotEmpty(message="{NotEmpty.user.email}")
    @Getter @Setter @Column(name = "email")
    private String email;

    @NotNull(message="{NotBlank.user.phonenumber}")
    @Min(1)
    @Max(10)
    @Getter @Setter @Column(name = "phonenumber")
    private BigInteger phoneNumber;

    @NotNull(message="{NotBlank.user.age}")
    @Min(1)
    @Max(99)
    @Getter @Setter @Column(name = "age")
    private Integer age;
    
}
