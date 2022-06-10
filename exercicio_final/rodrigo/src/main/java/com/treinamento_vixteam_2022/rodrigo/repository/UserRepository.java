package com.treinamento_vixteam_2022.rodrigo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.treinamento_vixteam_2022.rodrigo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User findByUsernameAndPassword(String username, String password);
}
