package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;

@Controller
public class HelloController {
	// localhost:8080/hola
	@RequestMapping("/")

	public String hello(Model model) {
		model.addAttribute("mensaje", "hola desde thymeleaf");
		return "hola";
	}

	// localhost:8080/
	@RequestMapping("/")
	public String index(Model model) {
		// necesario para que el formulario funcione
		model.addAttribute("student", new Student());
		// devuelve la pagina de index.html
		return "index";
	}

}
