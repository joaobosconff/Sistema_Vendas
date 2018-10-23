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

import br.unifacisa.si.treinamento.SistemaVendas.domains.Categoria;
import br.unifacisa.si.treinamento.SistemaVendas.exception.CategoriaException;
import br.unifacisa.si.treinamento.SistemaVendas.services.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaservice;

	@PostMapping
	public ResponseEntity<Categoria> createCategoria(Categoria c) throws CategoriaException{
		return new ResponseEntity<Categoria>(categoriaservice.createCategoria(c), HttpStatus.OK);
		}
	
	@PutMapping
	public ResponseEntity<Categoria> updateCategoria(Categoria categoria) {

		return new ResponseEntity<Categoria>(categoriaservice.updateCategoria(categoria), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<ArrayList<Categoria>> readAll() {
		ArrayList<Categoria> categorias;
		categorias = categoriaservice.readAll();
		return new ResponseEntity<ArrayList<Categoria>>(categorias, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> readCategoria(@PathVariable("id") String idCategoria) {
	return new ResponseEntity<Categoria>(categoriaservice.readCategoria(idCategoria), HttpStatus.OK);
	}	
	
	@DeleteMapping
	public ResponseEntity<Categoria> deleteCategoria(Categoria categoria) {

		return new ResponseEntity<Categoria>(categoriaservice.deleteCategoria(categoria), HttpStatus.OK);

	}
}
	
