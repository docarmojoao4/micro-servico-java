# Microserviço de Estudantes e Data/Hora

Microserviço desenvolvido em **Java com Spring Boot**, com o objetivo de praticar a criação de APIs REST, organização em camadas, DTOs, validação de dados e injeção de dependências.

## Tecnologias utilizadas

* Java 17
* Spring Boot 4.1.1
* Spring Web
* Spring Boot DevTools
* Validation
* Maven
* IntelliJ IDEA

## Estrutura do projeto

O projeto foi organizado separando as responsabilidades em diferentes pacotes:

```text
src/
└── main/
    └── java/
        └── com.example.microservice/
            ├── controller/
            │   ├── EstudanteController.java
            │   └── DataHoraController.java
            │
            ├── dto/
            │   ├── Estudante.java
            │   └── DataHora.java
            │
            └── service/
                ├── EstudanteService.java
                └── DataHoraService.java
```

## Endpoints

### 1. Calcular média do estudante

**POST** `/estudantes/media`

Recebe os dados do estudante no corpo da requisição e calcula sua média com base em duas notas.

#### Requisição

```json
{
  "nome": "João",
  "nota1": 8.0,
  "nota2": 7.0
}
```

#### Regras

* O nome do estudante é obrigatório.
* As notas devem ser maiores ou iguais a `0`.
* As notas devem ser menores ou iguais a `10`.
* Média maior que `5` → estudante aprovado.
* Média menor que `5` → estudante reprovado.
* Média igual a `5` → estudante reprovado por não atingir a nota de corte.

#### Exemplo de resposta

```text
Parabéns, João! Você foi aprovado com média 7.5
```

---

### 2. Consultar data e hora

**GET** `/data-hora`

Retorna a data e a hora atuais da máquina em que a aplicação está sendo executada.

#### Exemplo de resposta

```json
{
  "data": "02/09/2026",
  "hora": "01:15:30"
}
```
---

## Como executar o projeto

### 1. Clonar o repositório

```bash
git clone URL_DO_REPOSITORIO
```

### 2. Entrar na pasta do projeto

```bash
cd nome-do-projeto
```

### 3. Executar a aplicação

Utilizando Maven:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A aplicação será iniciada, por padrão, na porta `8080`.

---

## Testando a API

Os endpoints podem ser testados utilizando ferramentas como **Postman**, **Insomnia** ou qualquer cliente HTTP.

### POST

```text
POST http://localhost:8080/estudantes/media
```

Body:

```json
{
  "nome": "João",
  "nota1": 8.0,
  "nota2": 7.0
}
```

### GET

```text
GET http://localhost:8080/data-hora
```
