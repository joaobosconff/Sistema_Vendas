package br.unifacisa.si.treinamento.SistemaVendas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Categoria;
import br.unifacisa.si.treinamento.SistemaVendas.respository.CategoriaRepository;
import br.unifacisa.si.treinamento.SistemaVendas.exception.CategoriaException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriarepository;
	
	
	public Categoria createCategoria(Categoria a) throws CategoriaException {
		if(a.getNome()!= null && a.getId()!= null) {
			categoriarepository.save(a);}
		else {
			throw new CategoriaException();
		}
		return a;
		
	}

	public ArrayList<Categoria> readAll(){
		return (ArrayList<Categoria>) categoriarepository.findAll();
	}
	
	
	public Categoria readCategoria(String id) throws CategoriaException {
		if(!categoriarepository.findById(id).isPresent()) {
			throw new CategoriaException();
		}
		return categoriarepository.findById(id).get();
	}
	
	public Categoria updateCategoria(Categoria a) throws CategoriaException {
		if(a.getId() == null && a.getNome() == null) {
			throw new CategoriaException();
		}
		
		Categoria aux = readCategoria(a.getId());
		aux.setNome(a.getNome());
		
		return categoriarepository.save(aux);
			
		}
	
	public Categoria deleteCategoria(Categoria a) {
		categoriarepository.deleteById(a.getId());
		return a;
	}
}

