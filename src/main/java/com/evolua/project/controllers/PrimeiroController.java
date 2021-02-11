package com.evolua.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	// Passo 1 - TESTE MAIN 1
	// criado controller de teste - didatico

	// @RequestMapping(method = RequestMethod.GET, path = "/Spring") //http://localhost:8080/Spring ou http://localhost:8080
	@GetMapping(path = { "/Teste", "/Spring" }) //http://localhost:8080/Spring e http://localhost:8080/Teste
	public String Teste() {
		return "SpringBoot Teste 1 !";
		/*
		 * usar classe anotation para devolver os dados ao browser. Anota a classe
		 * => @RestController depois mapear com @RequestMapping a partir daí ja aparece
		 * a mensagem no console localhost:8080 de seu navegador
		 */
	}
	
	// Passo 2	 - TESTE MAIN 2 
	@GetMapping(path = { "/Teste2", "/Spring2" }) // http://localhost:8080/Spring e http://localhost:8080/Teste
	@PostMapping(path = { "/Teste2", "/Spring2" })
	public String Teste2() {
		return "SpringBoot Teste 2!";  //http://localhost:8080/Teste2 e http://localhost:8080/Spring2
	}
	 
	

}

/*

Aprendendo Json na url - JSON FORMATER
	=> https://jsonformatter.curiousconcept.com/
	{
			"nome": "TesteJsonFormater",
			"dataNascimento": "26/06/2020",
			"vip": true,
			"endereco": {
			   "logradouro": "Rua xxxx",
			   "numero": 123456
			}
	}

 */