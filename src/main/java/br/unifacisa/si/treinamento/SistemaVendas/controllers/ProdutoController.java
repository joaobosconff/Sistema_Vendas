package br.unifacisa.si.treinamento.SistemaVendas.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Produto;
import br.unifacisa.si.treinamento.SistemaVendas.exception.ProdutoException;
import br.unifacisa.si.treinamento.SistemaVendas.services.ProdutoService;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoservice;

	@PostMapping
	public ResponseEntity<Produto> createMarca(Produto p) throws ProdutoException{
		return new ResponseEntity<Produto>(produtoservice.createProduto(p), HttpStatus.OK);
		}
	
	@PutMapping
	public ResponseEntity<Produto> updateMarca(Produto p) throws ProdutoException {

		return new ResponseEntity<Produto>(produtoservice.updateProduto(p), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<ArrayList<Produto>> readAll() {
		ArrayList<Produto> produtos;
		produtos = produtoservice.readAll();
		return new ResponseEntity<ArrayList<Produto>>(produtos, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> readMarca(@PathVariable("id") String idProduto) throws ProdutoException {
	return new ResponseEntity<Produto>(produtoservice.readProduto(idProduto), HttpStatus.OK);
	}	
	
	@DeleteMapping
	public ResponseEntity<Produto> deleteProduto(Produto p) throws ProdutoException {

		return new ResponseEntity<Produto>(produtoservice.deleteProduto(p), HttpStatus.OK);

	}

}
