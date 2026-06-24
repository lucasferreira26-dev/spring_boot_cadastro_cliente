# \# Cadastro de Clientes - Spring Boot



\## 📖 Sobre o Projeto



Este projeto foi desenvolvido com o objetivo de praticar os conceitos fundamentais do ecossistema Spring Boot, utilizando uma arquitetura em camadas e expondo uma API REST para gerenciamento de clientes.



A aplicação permite realizar operações completas de CRUD (Create, Read, Update e Delete) persistindo os dados em um banco de dados MySQL através do Spring Data JPA e Hibernate.



\---



\## 🚀 Tecnologias Utilizadas



\* Java 17

\* Spring Boot

\* Spring Web

\* Spring Data JPA

\* Hibernate

\* MySQL

\* Maven

\* Postman

\* IntelliJ IDEA



\---



\## 📂 Arquitetura do Projeto



O projeto foi desenvolvido seguindo o padrão de Arquitetura em Camadas:



```text

Controller

&#x20;   ↓

Service

&#x20;   ↓

Repository

&#x20;   ↓

Banco de Dados

```



\### Controller



Responsável por receber as requisições HTTP da API e devolver as respostas ao cliente.



\### Service



Contém as regras de negócio da aplicação.



\### Repository



Responsável pela comunicação com o banco de dados utilizando Spring Data JPA.



\### Entity



Representa a tabela do banco de dados através de classes Java.



\---



\## 🗄️ Estrutura do Projeto



```text

src

└── main

&#x20;   ├── java

&#x20;   │   └── com.lucas.cadastrocliente

&#x20;   │       ├── controller

&#x20;   │       │   └── ClienteController

&#x20;   │       ├── service

&#x20;   │       │   └── ClienteService

&#x20;   │       ├── repository

&#x20;   │       │   └── ClienteRepository

&#x20;   │       ├── model

&#x20;   │       │   └── Cliente

&#x20;   │       └── CadastroClienteApplication

&#x20;   │

&#x20;   └── resources

&#x20;       └── application.properties

```



\---



\## 🗃️ Banco de Dados



Tabela utilizada:



```sql

CREATE TABLE cliente (

&#x20;   id BIGINT AUTO\_INCREMENT PRIMARY KEY,

&#x20;   nome VARCHAR(100) NOT NULL,

&#x20;   email VARCHAR(100) NOT NULL

);

```



\---



\## 🔗 Endpoints da API



\### Buscar todos os clientes



```http

GET /clientes

```



\#### Exemplo de resposta



```json

\[

&#x20; {

&#x20;   "id": 1,

&#x20;   "nome": "Lucas",

&#x20;   "email": "lucas@email.com"

&#x20; }

]

```



\---



\### Buscar cliente por ID



```http

GET /clientes/{id}

```



\#### Exemplo



```http

GET /clientes/1

```



\---



\### Cadastrar cliente



```http

POST /clientes

```



\#### Body



```json

{

&#x20; "nome": "Lucas",

&#x20; "email": "lucas@email.com"

}

```



\---



\### Atualizar cliente



```http

PUT /clientes/{id}

```



\#### Body



```json

{

&#x20; "nome": "Lucas Ferreira",

&#x20; "email": "lucasferreira@email.com"

}

```



\---



\### Remover cliente



```http

DELETE /clientes/{id}

```



\#### Exemplo



```http

DELETE /clientes/1

```



\---



\## ⚙️ Configuração do Banco de Dados



Arquivo `application.properties`:



```properties

spring.datasource.url=jdbc:mysql://localhost:3306/cadastro\_cliente

spring.datasource.username=SEU\_USUARIO

spring.datasource.password=SUA\_SENHA



spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

```



\---



\## ▶️ Como Executar o Projeto



\### Clonar o repositório



```bash

git clone https://github.com/lucasferreira26-dev/spring\_boot\_cadastro\_cliente.git

```



\### Entrar na pasta do projeto



```bash

cd cadastro-cliente

```



\### Executar



```bash

mvn spring-boot:run

```



Ou executar a classe:



```java

CadastroClienteApplication

```



\---



\## 🎯 Objetivos de Aprendizagem



Durante o desenvolvimento deste projeto foram praticados os seguintes conceitos:



\* Criação de APIs REST

\* Arquitetura em Camadas

\* Injeção de Dependência

\* Spring Boot

\* Spring Data JPA

\* Hibernate

\* Persistência de Dados

\* Integração com MySQL

\* Testes de API utilizando Postman

\* Operações CRUD



\---



\## 👨‍💻 Autor



Lucas Ferreira



Projeto desenvolvido para fins de estudo e prática com Java, Spring Boot e APIs REST.



