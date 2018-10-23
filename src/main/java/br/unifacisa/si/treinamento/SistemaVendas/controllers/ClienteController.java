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

import br.unifacisa.si.treinamento.SistemaVendas.domains.Cliente;
import br.unifacisa.si.treinamento.SistemaVendas.exception.ClienteException;
import br.unifacisa.si.treinamento.SistemaVendas.services.ClienteService;
@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteservice;

	@PostMapping
	public ResponseEntity<Cliente> createCliente(Cliente c) throws ClienteException{
		return new ResponseEntity<Cliente>(clienteservice.createCliente(c), HttpStatus.OK);
		}
	
	@PutMapping
	public ResponseEntity<Cliente> updateCliente(Cliente c) throws ClienteException {

		return new ResponseEntity<Cliente>(clienteservice.updateCliente(c), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<ArrayList<Cliente>> readAll() {
		ArrayList<Cliente> clientes;
		clientes = clienteservice.readAll();
		return new ResponseEntity<ArrayList<Cliente>>(clientes, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> readCliente(@PathVariable("id") String idCliente) throws ClienteException {
	return new ResponseEntity<Cliente>(clienteservice.readCliente(idCliente), HttpStatus.OK);
	}	
	
	@DeleteMapping
	public ResponseEntity<Cliente> deleteCliente(Cliente c) throws ClienteException {

		return new ResponseEntity<Cliente>(clienteservice.deleteCliente(c), HttpStatus.OK);

	}

}
