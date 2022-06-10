package com.treinamento_vixteam_2022.rodrigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.treinamento_vixteam_2022.rodrigo.model.Client;
import com.treinamento_vixteam_2022.rodrigo.service.ClientService;

@Controller
public class PanelController {
  @Autowired
  private ClientService clientService;

  @GetMapping("/painel")
  public ModelAndView getPanelPage(){
    List<Client> clientList = this.clientService.findAll();
    ModelAndView mv = new ModelAndView("panel/panel");
    mv.addObject("clientList", clientList);
    return mv;
  }

}
