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
	
	
	public Categoria createCategoria(Categoria a) {
		if(a.getNome()!= null && a.getId()!= null) {
			categoriarepository.save(a);}
		return a;
	}

	public ArrayList<Categoria> readAll(){
		return (ArrayList<Categoria>) categoriarepository.findAll();
	}
	
	
	public Categoria readCategoria(Categoria a) throws CategoriaException {
		String idcategoria = a.getId();
		if(!categoriarepository.findById(idcategoria).isPresent()) {
			throw new CategoriaException();
		}
		return categoriarepository.findById(idcategoria).get();
	}
	
	public Categoria updateCategoria(Categoria a) throws CategoriaException {
		if(a.getId() == null && a.getNome() == null) {
			throw new CategoriaException();
		}
		
		Categoria aux = readCategoria(a);
		aux.setNome(a.getNome());
		
		return categoriarepository.save(aux);
			
		}
	
	public Categoria removeCategoria(Categoria a) {
		categoriarepository.deleteById(a.getId());
		return a;
	}
}

