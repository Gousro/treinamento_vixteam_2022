package com.treinamento_vixteam_2022.rodrigo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Table(name = "client")
@Entity
@Data
public class Client {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Column(name = "name", nullable = false)
  private String name;

  @NotBlank
  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "address")
  private String address;

  @Column(name = "fu", length = 2)
  private String fu;

  @Column(name = "city")
  private String city;

  @Column(name = "neighborhood")
  private String neighborhood;

  @Column(name = "address_number")
  private String address_number;

  @Column(name = "complement")
  private String complement;

  @Column(name = "telephone")
  private String telephone;

  @Column(name = "cellphone")
  private String cellphone;

}
