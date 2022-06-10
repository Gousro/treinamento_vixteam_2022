package com.treinamento_vixteam_2022.rodrigo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

  @GetMapping("/")
  public ModelAndView getHomePage(){
    ModelAndView mv = new ModelAndView("index");
    return mv;
  }

}
