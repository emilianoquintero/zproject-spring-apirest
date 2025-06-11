package com.example.zproject_spring_apirest.services;

import java.util.List;
import java.util.Optional;

import com.example.zproject_spring_apirest.dto.DebtDto;
import com.example.zproject_spring_apirest.entities.Debt;

public interface DebtService {

    // List<Object[]> findAllDebts();

    List<Debt> findAll();

    Optional<Debt> findById(Long id);

    Debt save(Debt debt);

    Optional<Debt> update(Long id, Debt debt);

    Optional<Debt> delete(Long id);

    List<DebtDto> findAllDebts();

    List<DebtDto> findUserDebt(Long id);
}
