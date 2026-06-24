package com.lucas.cadastrocliente.service;

import com.lucas.cadastrocliente.entity.Cliente;
import com.lucas.cadastrocliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Aqui fica a camada responsável pela lógica de negócio. No momento temos apenas
// o CRUD da aplicação

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Salva um novo cliente no banco de dados
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Retorna todos os clientes cadastrados
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    // Retorna um cliente com base em seu id
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    // Deleta um cliente pelo seu id
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    // Atualiza os dados de um cliente existente
    public Cliente atualizar(Long id, Cliente novoCliente) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        cliente.setNome(novoCliente.getNome());
        cliente.setEmail(novoCliente.getEmail());

        return clienteRepository.save(cliente);
    }
}
