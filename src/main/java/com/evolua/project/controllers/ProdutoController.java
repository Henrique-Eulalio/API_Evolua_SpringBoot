package com.evolua.project.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.evolua.project.entities.interfaceRepositories.ProdutoRepository;
import com.evolua.project.model.entities.Produto;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

	private static final Produto Ok = null;
	// Injeção de Dependencia
	@Autowired
	private ProdutoRepository produtoRepository;// para instanciar autowired - injeção dependencia

//	@Autowired
//	private ProdutoServicos service;

	// Exemplo 01
//	@PostMapping
//	public @ResponseBody Produto novoProduto(
//			@RequestParam String nome,
//			@RequestParam  double preco,
//			@RequestParam double desconto) {
//		Produto produto = new Produto(0, nome, preco, desconto);
//		produtoRepository.save(produto); //para salvar no banco de dados
//		return produto;	
//	}

	// ou
	// Exemplo 02
	@PostMapping
	public @ResponseBody Produto novoProduto(@Validated Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	
	@GetMapping
	public @ResponseBody ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = (List<Produto>) produtoRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Produto>> findById(@PathVariable Integer id) {
		Optional<Produto> obj = produtoRepository.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	
	@DeleteMapping(value = "/{id}")
	@Transactional
	public @ResponseBody Produto DeleteProduto(@PathVariable Integer id) throws Exception {
		try {
			produtoRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		// return Ok;
		return Ok;
	}

	
	@PutMapping(value = "/{id}")
	@Transactional
	public @ResponseBody Produto UpdateProduto(@Validated Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

//	
//	@PutMapping(value = "/{id}")
//	@Transactional
//	public @ResponseBody Produto UpdateProduto(@PathVariable Integer id, @RequestBody Produto produto){
//		produtoRepository.save(produto);
//		return produto;
//	}

//	
//	@PutMapping(value = "/{id}")
//	@Transactional
//	public ResponseEntity<Optional<Produto>> UpdateProduto(@PathVariable Integer id, @RequestBody Produto produto){
//		Optional<Produto> obj = produtoRepository.findById(id);
//		produtoRepository.save(produto);
//		return ResponseEntity.ok().body(obj);
//	}

//	//para atualizar 
//	@Autowired
//	private void updateData(Produto entity, Produto obj) {
//		entity.setNome(obj.getNome());
//		entity.setPreco(obj.getPreco());
//		entity.setDesconto(obj.getDesconto());
//	}
//	
//	
//		@PutMapping(value = "/{id}") 
//		public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto obj ){
//			obj = update(id, obj);
//			return ResponseEntity.ok().body(obj);
//	}
//	

}