package com.acme.compras;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/")
	public ModelAndView index() {
		
		ModelAndView model = new ModelAndView("index");
		
		model.addObject("item", new Item());
		
		return model;
	}
	
	
	@PostMapping("/")
	public ModelAndView add(Item item) {
		
		System.out.println("NOME: " + item.getNome());
		System.out.println("QUANTIDADE: " + item.getQuantidade());
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("item", new Item());
		return model;
		
	}
	
}
