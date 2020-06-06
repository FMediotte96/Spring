package com.facu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class OtherController {
	
	@RequestMapping("/showForm")
	public String showForm() { //proporciona el form que vamos a visualizar en la vista
		return "firstForm";
	}

	@RequestMapping("/otherProcessForm")
	//public String otherProcessForm(HttpServletRequest request, Model model) {
	public String otherProcessForm(@RequestParam("nombre") String nombre, Model model) {
	
		nombre += " pasando por el otro controlador";
		String mensajeFinal = "El user es: " + nombre;
		
		//agregando info al modelo
		model.addAttribute("msjUser", mensajeFinal);
		
		return "processForm";
	}
}
