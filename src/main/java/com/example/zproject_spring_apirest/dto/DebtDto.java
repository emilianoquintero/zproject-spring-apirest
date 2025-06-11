package com.example.zproject_spring_apirest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

// The creation of a DTO is necesary for more structured querys.
// The use of a DTO (Data Transfer Object) in this context is a recommended and professional practice when:
// - You are making queries that join data from multiple tables (such as a JOIN).
// - The result does not correspond to a specific entity in your model.
public class DebtDto {

    private Integer debtId;
    private Integer userId;
    private String firstName;
    private String secondName;
    private String email;
    private Long phoneNumber;
    private BigDecimal debtAmount;
    private LocalDate dueDate;
    private String description;

    // The constructor is necessary in a DTO because it allows initializing its attributes when an instance is created. 
    // In Java, objects must have their values assigned before being used, and the constructor facilitates this task in a structured manner.
    public DebtDto(Integer debtId, Integer userId, String firstName, String secondName,  String email, Long phoneNumber, BigDecimal debtAmount, LocalDate dueDate, String description) {
        this.debtId = debtId;
        this.userId = userId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.debtAmount = debtAmount;
        this.dueDate = dueDate;
        this.description = description;
    }
    
    public Integer getDebtId() { return debtId; }
    public Integer getUserId() { return userId; }
    public String getFirstName() { return firstName; }
    public String getSecondName() { return secondName; }
    public String getEmail() { return email; }
    public Long getPhoneNumber() { return phoneNumber; }
    public BigDecimal getDebtAmount() { return debtAmount; }
    public LocalDate getDueDate() { return dueDate; }
    public String getDescription() { return description; }

}
