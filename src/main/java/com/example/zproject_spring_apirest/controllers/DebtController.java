package com.example.zproject_spring_apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zproject_spring_apirest.dto.DebtDto;
import com.example.zproject_spring_apirest.services.DebtService;


@RestController
@RequestMapping("api/users_debt")
public class DebtController {

    @Autowired
    private DebtService service;

    @GetMapping("/alldebts")
    // // public ResponseEntity<List<Object[]>> getAllDebts() {
    //     // return ResponseEntity.ok(service.findAllDebts());
    // }
    public ResponseEntity<List<DebtDto>> getAllDebts() {
        return ResponseEntity.ok(service.findAllDebts());
    }
    


}
