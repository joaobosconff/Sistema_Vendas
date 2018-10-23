package br.unifacisa.si.treinamento.SistemaVendas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Venda;
import br.unifacisa.si.treinamento.SistemaVendas.exception.VendaException;
import br.unifacisa.si.treinamento.SistemaVendas.respository.VendaRepository;

@Service
public class VendaService {
	@Autowired
	private VendaRepository vendarepository;
	
	
	
	public Venda createVenda(Venda v) throws VendaException{
		if(v.getId() == null || v == null) {
			throw new VendaException();}
		return vendarepository.save(v);
		
	}
	
	public ArrayList<Venda> readAll(){
		return (ArrayList<Venda>) vendarepository.findAll();
	}
	
	public Venda readVenda(String id) throws VendaException{
		if(!vendarepository.findById(id).isPresent()) {
			throw new VendaException();
		}
		return vendarepository.findById(id).get();
	}
	
	public Venda updateVenda(Venda v) throws VendaException {
		if(v.getId() == null ) {
			throw new VendaException();
		}
		return vendarepository.save(v);
	}
	public Venda deleteVenda(Venda v) throws VendaException{
		if(v == null || v.getId() == null) {
			throw new VendaException();
		}
		vendarepository.deleteById(v.getId());
		return v;
	}
	
	

}
