package br.iff.edu.exercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.iff.edu.exercicio.model.User;
import br.iff.edu.exercicio.model.Users;
import nz.net.ultraq.thymeleaf.LayoutDialect;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private Users users;
	
	@GetMapping
	public ModelAndView display(){
		ModelAndView modelAndView = new	ModelAndView("Register");
		modelAndView.addObject(new User());
		return modelAndView;
	}
	
	@PostMapping
	public String save(User user){
		this.users.save(user);
		return "redirect:/register";
	}
	
	@Bean
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect();
	}
}
