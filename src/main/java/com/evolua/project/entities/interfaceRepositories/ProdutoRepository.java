package com.evolua.project.entities.interfaceRepositories;

import org.springframework.data.repository.CrudRepository;

import com.evolua.project.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
