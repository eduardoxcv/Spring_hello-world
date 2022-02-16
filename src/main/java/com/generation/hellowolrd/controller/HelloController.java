package com.generation.hellowolrd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String gethello() {
		return "Hello Wold";
		
	}
	
	@GetMapping ("mentalidaes")
	public String mentalidades() {
		return "--Mentalidades--\r\n"
				+ "\r\n(Orientação ao futuro,\r\n"
				+ "Responsabilidade pessoal,\r\n"
				+ "Mentalidade de crescimento e \r\n"
				+ "Persistência). \r\n"
				+ "--Habilidades--\t\r\n"
				+ "(Trabalho em equipe, \r\n"
				+ "Atenção aos detalhes, \r\n"
				+ "Proatividade e \r\n"
				+ "Comunicação).";
		
	}
	@GetMapping ("aprendizagem")
	public String aprendizagem() {
		return "Meus Objetivos essa semana: são:\r\n"
				+ "Aprimorar os conhecimentos no MySQL e \r\n"
				+ "aprender a usar e treinar em cima do Spring.\r\n"
				;
}
}
