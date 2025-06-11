package com.example.zproject_spring_apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zproject_spring_apirest.dto.DebtDto;
import com.example.zproject_spring_apirest.entities.Debt;
import com.example.zproject_spring_apirest.services.DebtService;





@RestController
@RequestMapping("api/users_debt")
public class DebtController {

    @Autowired
    private DebtService service;

    @GetMapping()
    public ResponseEntity<List<Debt>> List() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Debt debt) {
        //TODO: process POST request
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(debt));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putMethodName(@PathVariable Long id, @RequestBody Debt debt) {
        //TODO: process PUT request
        Optional<Debt> debtOptional = service.update(id, debt);
        if (debtOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.CREATED).body(debtOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Optional<Debt> debtOptional = service.delete(id);
        if(debtOptional.isPresent()){
            return ResponseEntity.ok(debtOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
    
    @GetMapping("/allusersdebts")
    // // public ResponseEntity<List<Object[]>> getAllDebts() {
    //     // return ResponseEntity.ok(service.findAllDebts());
    // }
    public ResponseEntity<List<DebtDto>> getAllUserDebts() {
        return ResponseEntity.ok(service.findAllDebts());
    }

    @GetMapping("/userdebt/{id}")
    public ResponseEntity<?> getUserDebt(@PathVariable Long id) {
        Optional<Debt> userOptional = service.findById(id);
        if(userOptional.isPresent()){
            return ResponseEntity.ok(userOptional.orElseThrow());
        }
        return ResponseEntity.ok(service.findUserDebt(id));
    }

}
