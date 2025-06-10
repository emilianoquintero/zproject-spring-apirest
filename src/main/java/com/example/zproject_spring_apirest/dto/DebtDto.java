package com.example.zproject_spring_apirest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

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
