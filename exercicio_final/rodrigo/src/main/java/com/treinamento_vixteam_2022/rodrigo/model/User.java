package com.treinamento_vixteam_2022.rodrigo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Table(name = "user")
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_user")
  private Long id;

  @NotBlank
  @Column(name = "username", nullable = false)
  private String username;

  @NotBlank
  @Column(name = "password", nullable = false, length = 16)
  private String password;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User(){}

  public User(Long id, @NotBlank String username, @NotBlank String password) {
    this.id = id;
    this.username = username;
    this.password = password;
  }

}
