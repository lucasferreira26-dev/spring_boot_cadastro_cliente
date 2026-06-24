package com.lucas.cadastrocliente.controller;

import com.lucas.cadastrocliente.entity.Cliente;
import com.lucas.cadastrocliente.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Aqui fica a camada responsável por receber requisições HTTP(GET, POST, PUT...)
// Fluxo: Controller -> Service -> Repository -> Banco de dados

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Mapeia a requisição POST para criar novos clientes para o banco de dados
    // Recebe JSON no body e converte JSON em objeto java automaticamente
    // Exemplo da requisição -> POST http://localhost:8080/clientes
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    // Mapeia a requisição GET para retornar todos os clientes cadastrados
    // Exemplo da requisição -> GET http://localhost:8080/clientes
    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.listarTodos();
    }

    // Mapeia a requisição GET para buscar um cliente especifico pelo seu id no banco de dados
    // @PathVariable pega o valor da URL
    // Exemplo da requisição -> GET http://localhost:8080/clientes/1 (o valor 1 é o valor passado
    // como argumento do id que se busca)
    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    // Mapeia a requisição DELETE para remover um cliente do banco com base em seu id
    // Exemplo da requisição -> DELETE http://localhost:8080/clientes/1
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clienteService.deletar(id);
    }

    // Mapeia a requisição PUT para atualizar uma linha do banco de dados, ou seja, um cliente
    // Usa id da URL para localizar a linha/registro u usa body para os novos dados
    // Exemplo da requisição -> PUT http://localhost:8080/clientes/1
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        return clienteService.atualizar(id, cliente);
    }
}
