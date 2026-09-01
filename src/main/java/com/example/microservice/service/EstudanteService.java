package com.example.microservice.service;

import com.example.microservice.dto.Estudante;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService {
    public String calcularMedia(Estudante estudante){
        double media = (estudante.nota1()+estudante.nota2())/2;
        if(media > 5){
            return "Parabéns, "+estudante.nome()+"! Você foi aprovado com média "+media;
        }else if(media < 5) {
            return estudante.nome()+", você foi reprovado com média "+media;
        }else{
            return estudante.nome()+", você não atingiu a nota de corte e foi reprovado com média "+media;
        }
    }
}
