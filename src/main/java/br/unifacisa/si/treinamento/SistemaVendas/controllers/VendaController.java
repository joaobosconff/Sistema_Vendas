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

import br.unifacisa.si.treinamento.SistemaVendas.domains.Venda;
import br.unifacisa.si.treinamento.SistemaVendas.exception.VendaException;
import br.unifacisa.si.treinamento.SistemaVendas.services.VendaService;

@RestController
@RequestMapping("/Venda")
public class VendaController {
	@Autowired
	private VendaService vendaservice;

	@PostMapping
	public ResponseEntity<Venda> createVenda(Venda v) throws VendaException{
		return new ResponseEntity<Venda>(vendaservice.createVenda(v), HttpStatus.OK);
		}
	
	@PutMapping
	public ResponseEntity<Venda> updateVenda(Venda v) throws VendaException {

		return new ResponseEntity<Venda>(vendaservice.updateVenda(v), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<ArrayList<Venda>> readAll() {
		ArrayList<Venda> vendas;
		vendas = vendaservice.readAll();
		return new ResponseEntity<ArrayList<Venda>>(vendas, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Venda> readMarca(@PathVariable("id") String idVendas) throws VendaException {
	return new ResponseEntity<Venda>(vendaservice.readVenda(idVendas), HttpStatus.OK);
	}	
	
	@DeleteMapping
	public ResponseEntity<Venda> deleteVenda(Venda v) throws VendaException {

		return new ResponseEntity<Venda>(vendaservice.deleteVenda(v), HttpStatus.OK);

	}
}
