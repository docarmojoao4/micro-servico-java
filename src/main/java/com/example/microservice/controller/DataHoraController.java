package com.example.microservice.controller;

import com.example.microservice.dto.DataHora;
import com.example.microservice.service.DataHoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-hora")
public class DataHoraController {
    private final DataHoraService dataHoraService;

    public DataHoraController(DataHoraService dataHoraService){
        this.dataHoraService = dataHoraService;
    }

    @GetMapping
    public DataHora mostrarDataHora(){
        return dataHoraService.obterDataHora();
    }
}
