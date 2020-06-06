package com.facu.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/showForm")
	public String showForm() { //proporciona el form que vamos a visualizar en la vista
		return "firstForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "processForm";
	}
	
	@RequestMapping("/otherProcessForm")
	public String otherProcessForm(HttpServletRequest request, Model model) {
		
		String nombre = request.getParameter("nombre");
		nombre += " Mediotte";
		String mensajeFinal = "El usuario es: " + nombre;
		
		//agregando info al modelo
		model.addAttribute("msjUser", mensajeFinal);
		
		return "processForm";
	}
}
