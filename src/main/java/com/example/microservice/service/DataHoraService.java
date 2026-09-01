package com.example.microservice.service;

import com.example.microservice.dto.DataHora;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DataHoraService {

    private final DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

    public DataHora obterDataHora() {
        LocalDateTime agora = LocalDateTime.now();

        String data = agora.format(formatoData);
        String hora = agora.format(formatoHora);

        return new DataHora(data, hora);
    }
}
