package com.calculo.galones.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	private String submitForm(@ModelAttribute Carro carro){
		if(carro.getVehiculo() =='1'){
			carro.setResultado(carro.getRecorrido()/40);
			carro.setVehiculoName("Carro1");
		}else if(carro.getVehiculo() =='2') {
			carro.setResultado(carro.getRecorrido()/35);
			carro.setVehiculoName("Carro2");
		}else if(carro.getVehiculo() =='3') {
			carro.setResultado(carro.getRecorrido()/45);
			carro.setVehiculoName("Carro3");
		}
		return "resultado";
	}
	

}
