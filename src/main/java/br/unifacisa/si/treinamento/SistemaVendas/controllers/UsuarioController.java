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

import br.unifacisa.si.treinamento.SistemaVendas.domains.Usuario;
import br.unifacisa.si.treinamento.SistemaVendas.exception.UsuarioException;
import br.unifacisa.si.treinamento.SistemaVendas.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioservice;

	@PostMapping
	public ResponseEntity<Usuario> createMarca(Usuario u) throws UsuarioException{
		return new ResponseEntity<Usuario>(usuarioservice.createUsuario(u), HttpStatus.OK);
		}
	
	@PutMapping
	public ResponseEntity<Usuario> updateUsuario(Usuario u) throws UsuarioException {

		return new ResponseEntity<Usuario>(usuarioservice.updateUsuario(u), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<ArrayList<Usuario>> readAll() {
		ArrayList<Usuario> usuarios;
		usuarios = usuarioservice.readAll();
		return new ResponseEntity<ArrayList<Usuario>>(usuarios, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> readMarca(@PathVariable("id") String idUsuario) throws UsuarioException {
	return new ResponseEntity<Usuario>(usuarioservice.readUsuario(idUsuario), HttpStatus.OK);
	}	
	
	@DeleteMapping
	public ResponseEntity<Usuario> deleteUsuario(Usuario u) throws UsuarioException {

		return new ResponseEntity<Usuario>(usuarioservice.deleteUsuario(u), HttpStatus.OK);

	}

}
