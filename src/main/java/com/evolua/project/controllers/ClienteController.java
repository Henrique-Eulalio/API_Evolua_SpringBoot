package com.evolua.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evolua.project.model.entities.Cliente;

// MODEL DE CLIENTE - COM RETORNO DE OBJETOS

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

//Objeto01
	@GetMapping(path = "/obj1")
	public Cliente obterCliente() {
// id, nome, cpf
		return new Cliente(01, "TesteCliente_1", "000.000.000.000");
	}

//Objeto02	
	@GetMapping(path = "/obj2")
	public Cliente obterCliente2() {
// id, nome, cpf
		return new Cliente(02, "TesteCliente_2", "000.000.000.000");
	}

//Objeto03	
	@GetMapping(path = "/obj3")
	public Cliente obterCliente3() {
		// id, nome, cpf
		return new Cliente(03, "TesteCliente_3", "000.000.000.000");
	}

//Objeto04
		@GetMapping(path = "/obj4")
		public Cliente obterCliente4() {
			// id, nome, cpf
			return new Cliente(04, "TesteCliente_4", "000.000.000.000");
		}
		
//Usando Postman - GET
		//http://localhost:8080/cliente/1
		@GetMapping(path =  "/{id}")
		public Cliente obterClientePorId(@PathVariable int id) {
//			return new Cliente(id, "Nome 1 Postman", "000.000.000.000");
//			return new Cliente(1, "Nome 1 Postman", "000.000.000.000");
			return new Cliente(id, "Nome 1 Postman", "000.000.000.000");
		}
		
		
		//http://localhost:8080/cliente/?id=1
		@GetMapping
		public Cliente obterClientePorId2(@RequestParam(name="id", defaultValue = "1") int id) {
			return new Cliente(id, "Nome 2 Postman", "000.000.000.000");
		}
	
		

}