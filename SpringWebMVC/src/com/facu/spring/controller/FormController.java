package com.facu.spring.controller;

import org.springframework.stereotype.Controller;
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
}
