package com.treinamento_vixteam_2022.rodrigo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento_vixteam_2022.rodrigo.model.User;
import com.treinamento_vixteam_2022.rodrigo.repository.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  //
  public void save(User user){
    this.userRepository.save(user);
  }
  
  // LOGIN
  public User user(String username, String password){
    User user = userRepository.findByUsernameAndPassword(username, password);
    return user;
  }

}
