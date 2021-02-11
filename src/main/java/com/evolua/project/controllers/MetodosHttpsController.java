package com.evolua.project.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/metodosManipulacao")
public class MetodosHttpsController {
	
	//adicionar anotação relacionada
	@GetMapping
	public String get() {
		return "Requisição GET";
	}
	
	
	//adicionar anotação relacionada
	@PostMapping
	public String post() {
		return "Requisição POST";
	}
	
	
	
	//adicionar anotação relacionada
	@PutMapping
	public String put() {
		return "Requisição PUT";
	}
	
	
	
	//adicionar anotação relacionada
	@PatchMapping
	public String patch() {
		return "Requisição PATCH";
	}
	
	
	
	//adicionar anotação relacionada
	@DeleteMapping
	public String delete() {
		return "Requisição DELETE";
	}
	
	
	// nesse ponto, se cria um formulario para manipular caso nao tenha o Postman ou Insonmia
	//http://localhost:8080/formulario.html

}
