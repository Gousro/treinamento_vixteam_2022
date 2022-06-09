package com.example.Rodrigo;

import com.example.Rodrigo.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> getAllCliente();
    List<Cliente> getClienteByNome(String nome);
}
