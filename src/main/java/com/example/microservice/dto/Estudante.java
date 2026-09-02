package com.example.microservice.dto;

import jakarta.validation.constraints.*;

public record Estudante(
        @NotBlank(message = "O nome do estudante é obrigatório!")
        String nome,
        @DecimalMin(value = "0.0", message = "A nota não pode ser menor que 0!")
        @DecimalMax(value = "10.0", message = "A nota não pode ser maior que 10!")
        double nota1,
        @DecimalMin(value = "0.0", message = "A nota não pode ser menor que 0!")
        @DecimalMax(value = "10.0", message = "A nota não pode ser maior que 10!")
        double nota2) {
}
