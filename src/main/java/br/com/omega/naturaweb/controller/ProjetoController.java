package br.com.omega.naturaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projeto")
public class ProjetoController {
	
	@GetMapping("/novo")
	private String novo(){
		return "projetos/novo";
	}
	
}
