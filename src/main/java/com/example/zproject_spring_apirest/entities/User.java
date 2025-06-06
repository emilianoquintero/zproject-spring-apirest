package com.example.zproject_spring_apirest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @NotEmpty
    @Size(min=2, max=14)
    @Getter @Setter @Column(name = "firstname")
    private String firstName;

    @NotEmpty
    @Size(min=2, max=14)
    @Getter @Setter @Column(name = "secondname")
    private String secondName;

    @NotBlank
    @Getter @Setter @Column(name = "email")
    private String email;

    @NotEmpty
    @Size(min=10, max=10)
    @Getter @Setter @Column(name = "phonenumber")
    private String phoneNumber;

    @NotNull
    @Min(1)
    @Max(99)
    @Getter @Setter @Column(name = "age")
    private Integer age;
    
}
