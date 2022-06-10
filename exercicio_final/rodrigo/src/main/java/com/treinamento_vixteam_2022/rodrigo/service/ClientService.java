package com.treinamento_vixteam_2022.rodrigo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento_vixteam_2022.rodrigo.model.Client;
import com.treinamento_vixteam_2022.rodrigo.repository.ClientRepository;

@Service
public class ClientService {
  @Autowired
  private ClientRepository clientRepository;

  // Cadastra um novo cliente
  public void save(Client client){
    this.clientRepository.save(client);
  }

  // Deleta um cliente pelo ID
  public void delete(Long id){
    this.clientRepository.deleteById(id);
  }

  public List<Client> findAll() {
    return this.clientRepository.findAll();
  }

  public Client findById(Long id) {
    return this.clientRepository.findById(id).get();
  }

}
