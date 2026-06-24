package com.lucas.cadastrocliente.repository;

import com.lucas.cadastrocliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

// Aqui fica a camada resposável por acessar o banco de dados. Extendemos a interface JpaRepository
// para termos acesso aos métodos save(), findAll(), findById() e deleteById(), implementados no
// service. Faze-se desnecessário usar a anotação @Repository, porque quando o Spring encontra
// uma interface que extende JpaRepository ele cria uma implementação concreta em tempo de execução.
// Ele ainda registra essa implementação como Bean no container Spring e permite que seja injetada
// no service. Isso evita que façamos a camada de acesso ao DB de forma manual,o que nos economiza
// várias linhas de código.

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // É importante frizar que Cliente representa a tabela do banco de dados e Long representa
    // chave primária(ID) da entidade. Traduzindo a atuação da interface com os generics fica:
    // "Eu quero um repositório para a entidade Cliente, cuja chave primária é do tipo Long"
}
