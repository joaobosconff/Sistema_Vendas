package br.unifacisa.si.treinamento.SistemaVendas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Funcionario;
import br.unifacisa.si.treinamento.SistemaVendas.exception.FuncionarioException;
import br.unifacisa.si.treinamento.SistemaVendas.respository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionariorepository;

	
	
	public Funcionario createFuncionario(Funcionario f) throws FuncionarioException {
		if(f == null || f.getId() == null) {
			throw new FuncionarioException();
		}
		return funcionariorepository.save(f);
	}
	
	public ArrayList<Funcionario> readAll(){
		return (ArrayList<Funcionario>) funcionariorepository.findAll();
	}
	
	public Funcionario readFuncionario(String id) throws FuncionarioException{
		if(!funcionariorepository.findById(id).isPresent()) {
			throw new FuncionarioException();
		}
		
		return funcionariorepository.findById(id).get();
		
	}
	
	public Funcionario updateFuncionario(Funcionario f) throws FuncionarioException{
		if(f.getId() == null || f.getNome() == null) {
			throw new FuncionarioException();
		}
		return funcionariorepository.save(f);
	}
	
	public Funcionario deleteFuncionario(Funcionario f) throws FuncionarioException{
		if(f == null || f.getId() == null) {
			throw new FuncionarioException();
		}
		funcionariorepository.deleteById(f.getId());
		return f;
	}
}


