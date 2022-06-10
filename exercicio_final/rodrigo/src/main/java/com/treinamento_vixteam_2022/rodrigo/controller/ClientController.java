package com.treinamento_vixteam_2022.rodrigo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.treinamento_vixteam_2022.rodrigo.model.Client;
import com.treinamento_vixteam_2022.rodrigo.service.ClientService;

@Controller
public class ClientController {
  @Autowired
  private ClientService clientService;

  @GetMapping("/cliente/registrar")
  public ModelAndView getPageClient() {
    ModelAndView mv = new ModelAndView("client/sign-up-client");
    return mv;
  }

  @PostMapping("/client/add")
  public String saveClient(@Valid Client client, BindingResult result, RedirectAttributes redirect) {
    if (result.hasErrors()) {
      redirect.addFlashAttribute("mensagem", "Verifique os campos obrigatórios.");
      return "redirect:/cliente/registrar";
    }
    this.clientService.save(client);
    return "redirect:/painel";
  }

  @GetMapping("/painel/cliente/editar/{id}")
  public ModelAndView getEdit(@PathVariable("id") Long id) {
    ModelAndView mv = new ModelAndView("client/client-edit");
    List<Client> clientList = this.clientService.findAll();
    mv.addObject("clientList", clientList);
    Client client = this.clientService.findById(id);
    mv.addObject("client", client);

    return mv;
  }

  @GetMapping("/painel/cliente/delete/{id}")
  public String delete(@PathVariable("id") Long id) {
    this.clientService.delete(id);

    return "redirect:/painel";
  }
  
}
