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

import br.unifacisa.si.treinamento.SistemaVendas.domains.Marca;
import br.unifacisa.si.treinamento.SistemaVendas.exception.MarcaException;
import br.unifacisa.si.treinamento.SistemaVendas.services.MarcaService;

@RestController
@RequestMapping("/marca")
public class MarcaController {
	@Autowired
	private MarcaService marcaservice;

	@PostMapping
	public ResponseEntity<Marca> createMarca(Marca m) throws MarcaException{
		return new ResponseEntity<Marca>(marcaservice.createMarca(m), HttpStatus.OK);
		}
	
	@PutMapping
	public ResponseEntity<Marca> updateMarca(Marca m) throws MarcaException {

		return new ResponseEntity<Marca>(marcaservice.updateMarca(m), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<ArrayList<Marca>> readAll() {
		ArrayList<Marca> marcas;
		marcas = marcaservice.readAll();
		return new ResponseEntity<ArrayList<Marca>>(marcas, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Marca> readMarca(@PathVariable("id") String idMarca) throws MarcaException {
	return new ResponseEntity<Marca>(marcaservice.readMarca(idMarca), HttpStatus.OK);
	}	
	
	@DeleteMapping
	public ResponseEntity<Marca> deleteMarca(Marca m) throws MarcaException {

		return new ResponseEntity<Marca>(marcaservice.deleteMarca(m), HttpStatus.OK);

	}

}
