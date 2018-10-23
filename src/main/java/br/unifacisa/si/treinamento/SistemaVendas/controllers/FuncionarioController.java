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

import br.unifacisa.si.treinamento.SistemaVendas.domains.Funcionario;
import br.unifacisa.si.treinamento.SistemaVendas.exception.FuncionarioException;
import br.unifacisa.si.treinamento.SistemaVendas.services.FuncionarioService;
@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	@Autowired
	private FuncionarioService funcionarioservice;

	@PostMapping
	public ResponseEntity<Funcionario> createFuncionario(Funcionario f) throws FuncionarioException{
		return new ResponseEntity<Funcionario>(funcionarioservice.createFuncionario(f), HttpStatus.OK);
		}
	
	@PutMapping
	public ResponseEntity<Funcionario> updateFuncionario(Funcionario f) throws FuncionarioException {

		return new ResponseEntity<Funcionario>(funcionarioservice.updateFuncionario(f), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<ArrayList<Funcionario>> readAll() {
		ArrayList<Funcionario> funcionarios;
		funcionarios = funcionarioservice.readAll();
		return new ResponseEntity<ArrayList<Funcionario>>(funcionarios, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Funcionario> readFuncionario(@PathVariable("id") String idFuncionario) throws FuncionarioException {
	return new ResponseEntity<Funcionario>(funcionarioservice.readFuncionario(idFuncionario), HttpStatus.OK);
	}	
	
	@DeleteMapping
	public ResponseEntity<Funcionario> deleteFuncionario(Funcionario f) throws FuncionarioException {

		return new ResponseEntity<Funcionario>(funcionarioservice.deleteFuncionario(f), HttpStatus.OK);

	}


}
