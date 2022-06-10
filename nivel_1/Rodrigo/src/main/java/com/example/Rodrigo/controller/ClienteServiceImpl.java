package com.example.Rodrigo.controller;

import com.example.Rodrigo.ClienteRepository;
import com.example.Rodrigo.ClienteService;
import com.example.Rodrigo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllCliente() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> getClienteByNome(String nome) {
        return clienteRepository.findByNome(nome);
    }
}

