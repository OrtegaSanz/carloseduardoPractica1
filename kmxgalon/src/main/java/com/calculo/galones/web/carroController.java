package com.calculo.galones.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.calculo.galones.model.Carro;

@Controller
public class carroController {
	@GetMapping("/carro")
	private String initCreationForm(Model model) {
		model.addAttribute("carro", new Carro());
		return "carroAdd";
	}
	@PostMapping("/carro")
	private String submitForm(){
		return "resultado";
	}
	

}
