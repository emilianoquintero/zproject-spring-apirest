package com.example.zproject_spring_apirest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/api/get")
    public String prueba(){
        return "prueba";
    }
}
