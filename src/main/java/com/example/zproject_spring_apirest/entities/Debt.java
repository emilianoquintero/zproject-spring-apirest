package com.example.zproject_spring_apirest.entities;

import java.math.BigInteger;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user_debt")
public class Debt {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name="debt_id")
    private Long id;
    
    @Getter @Setter @Column(name = "user_id")
    private String firstName;
    
    @Getter @Setter @Column(name="debt_amount")
    private BigInteger debtAmount;
    
    @Getter @Setter @Column(name="due_date")
    private LocalDate dueDate;
    
    @Getter @Setter @Column(name="description")
    private String description;

}
