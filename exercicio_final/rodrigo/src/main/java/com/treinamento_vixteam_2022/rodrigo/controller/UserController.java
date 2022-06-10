package com.treinamento_vixteam_2022.rodrigo.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.treinamento_vixteam_2022.rodrigo.model.User;
import com.treinamento_vixteam_2022.rodrigo.service.UserService;

// @CrossOrigin(origins = "http://localhost:8081")

@Controller
public class UserController {
  @Autowired
  private UserService userService;

  // PÁGINA DE CADASTRO DE USUÁRIO
  @GetMapping("/registrar")
  public ModelAndView getSignUpUserPage() {
    ModelAndView mv = new ModelAndView("user/sign-up");
    return mv;
  }

  // CRIA UM NOVO USUÁRIO
  @PostMapping("/user/add")
  public String saveUser(@Valid User user, BindingResult result, RedirectAttributes redirect) {
    if (result.hasErrors()) {
      redirect.addFlashAttribute("mensagem", "Verifique os campos obrigatórios.");
      return "redirect:/registrar";
    }
    this.userService.save(user);
    return "redirect:/login";
  }

  // PÁGINA DE LOGIN
  @GetMapping("/login")
  public ModelAndView getLoginPage() {
    ModelAndView mv = new ModelAndView("user/sign-in");
    mv.addObject("user", new User());
    return mv;
  }

  @PostMapping("/sign-in")
  public String user(@ModelAttribute("user") User user) {

    User oauthUser = userService.user(user.getUsername(), user.getPassword());

    System.out.print(oauthUser);
    if (Objects.nonNull(oauthUser)) {
      return "redirect:/painel";
    } else {
      return "redirect:/login";
    }
  }

  @RequestMapping(value = { "/logout" }, method = RequestMethod.POST)
  public String logoutDo(HttpServletRequest request, HttpServletResponse response) {
    return "redirect:/login";
  }
}
