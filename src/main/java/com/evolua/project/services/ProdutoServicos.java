package com.evolua.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evolua.project.model.entities.Produto;


@Service
public class ProdutoServicos {
	
	@Autowired
	private ProdutoServicos service;
	
	//metodo - select all
	public List<Produto> findAll(){
		return service.findAll();
	}	
	
	
}

