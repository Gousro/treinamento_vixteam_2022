package com.treinamento_vixteam_2022.rodrigo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.treinamento_vixteam_2022.rodrigo.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
  @Override
  List<Client> findAll();

}
