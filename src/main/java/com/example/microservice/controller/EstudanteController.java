package com.example.microservice.controller;

import com.example.microservice.dto.Estudante;
import com.example.microservice.service.EstudanteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    private final EstudanteService estudanteService;
    public EstudanteController(EstudanteService estudanteService){
        this.estudanteService = estudanteService;
    }
    @PostMapping("/media")
    public String mostrarMedia(@RequestBody @Valid Estudante estudante){
       return estudanteService.calcularMedia(estudante);
    }
}
