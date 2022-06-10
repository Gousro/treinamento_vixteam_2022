package com.example.Rodrigo.controller;


import com.example.Rodrigo.model.Cliente;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class ClientsRest {

    @Autowired
    private ClienteServiceImpl clienteService;

    @GetMapping("/search")
    public String buscar(@RequestParam(name = "fname") String nome){
        List<Cliente> clienteEncontrado = clienteService.getClienteByNome(nome);

        JSONObject clienteJson = null;
        if(!clienteEncontrado.isEmpty()){
            clienteJson = new JSONObject(clienteEncontrado.get(0));
        }

        return !clienteEncontrado.isEmpty() ? clienteJson.toString() : "null";
    }
}
