package com.example.zproject_spring_apirest.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.zproject_spring_apirest.dto.DebtDto;
import com.example.zproject_spring_apirest.entities.Debt;
import com.example.zproject_spring_apirest.repositories.DebtRepository;

@Service
public class DebtServiceImpl implements DebtService {

    @Autowired
    private DebtRepository repository;

    @Override
    // public List<Object[]> findAllDebts() {
    public List<DebtDto> findAllDebts() {
        List<Object[]> rawResults = repository.findAllDebts();
        return rawResults.stream().map(row -> new DebtDto(
            (Integer) row[0], // Asegura que sea un número
            (Integer) row[1],
            (String) row[2],
            (String) row[3],
            (String) row[4],
            ((Number) row[5]).longValue(),
            (BigDecimal) row[6],
            ((java.sql.Date) row[7]).toLocalDate(),
            (String) row[8]
        )).collect(Collectors.toList());


        // return repository.findAllDebts();
    }

    @Override
    @Transactional(readOnly= true)
    public Optional<Debt> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Debt save(Debt debt) {
        return repository.save(debt);
    }

    @Override
    @Transactional
    public Optional<Debt> update(Long id, Debt debt) {
        Optional<Debt> debtOptional = repository.findById(id);
        if(debtOptional.isPresent()) {
            Debt debtDb = debtOptional.orElseThrow();

            debtDb.setFirstName(debt.getFirstName());
            debtDb.setDebtAmount(debt.getDebtAmount());
            debtDb.setDueDate(debt.getDueDate());
            debtDb.setDescription(debt.getDescription());
            return Optional.of(repository.save(debtDb));
        };
        return debtOptional;
    }

    @Override
    @Transactional
    public Optional<Debt> delete(Long id) {
        Optional<Debt> debtOptional = repository.findById(id);
        if(debtOptional.isPresent()) {
            repository.deleteById(id);
        }
        // debtOptional.ifPresent(debtDb -> {
        //     repository.delete(debtDb);
        // });
        return debtOptional;
    }


}
