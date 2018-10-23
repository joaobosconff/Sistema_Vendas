package br.unifacisa.si.treinamento.SistemaVendas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Marca;
import br.unifacisa.si.treinamento.SistemaVendas.exception.MarcaException;
import br.unifacisa.si.treinamento.SistemaVendas.respository.MarcaRepository;

@Service
public class MarcaService {
	
	@Autowired
	private MarcaRepository marcarepository;
	
	public Marca createMarca(Marca m) throws MarcaException{
		if(m.getId() == null || m == null) {
			throw new MarcaException();
		}
		return marcarepository.save(m);
	}
	
	public ArrayList<Marca> readAll(){
		return (ArrayList<Marca>) marcarepository.findAll();
	}
	
	public Marca readMarca(String id) throws MarcaException{
		if(!marcarepository.findById(id).isPresent()) {
			throw new MarcaException();
		}
		return marcarepository.findById(id).get();
	}
	
	public Marca updateMarca(Marca m) throws MarcaException {
		if(m.getId() == null || m.getNome() == null) {
			throw new MarcaException();
		}
		return marcarepository.save(m);
	}
	public Marca deleteMarca(Marca m) throws MarcaException{
		if(m == null || m.getId() == null) {
			throw new MarcaException();
		}
		marcarepository.deleteById(m.getId());
		return m;
	}

	
}
