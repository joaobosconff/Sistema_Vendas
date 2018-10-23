package br.unifacisa.si.treinamento.SistemaVendas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Usuario;
import br.unifacisa.si.treinamento.SistemaVendas.exception.UsuarioException;
import br.unifacisa.si.treinamento.SistemaVendas.respository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuariorepository;
	
	
	
	public Usuario createUsuario(Usuario u) throws UsuarioException{
		if(u.getId() == null || u == null) {
			throw new UsuarioException();}
		return usuariorepository.save(u);
		
	}
	
	public ArrayList<Usuario> readAll(){
		return (ArrayList<Usuario>) usuariorepository.findAll();
	}
	
	public Usuario readUsuario(String id) throws UsuarioException{
		if(!usuariorepository.findById(id).isPresent()) {
			throw new UsuarioException();
		}
		return usuariorepository.findById(id).get();
	}
	
	public Usuario updateUsuario(Usuario u) throws UsuarioException {
		if(u.getId() == null ) {
			throw new UsuarioException();
		}
		return usuariorepository.save(u);
	}
	public Usuario deleteUsuario(Usuario u) throws UsuarioException{
		if(u == null || u.getId() == null) {
			throw new UsuarioException();
		}
		usuariorepository.deleteById(u.getId());
		return u;
	}

}
