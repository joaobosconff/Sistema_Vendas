package br.unifacisa.si.treinamento.SistemaVendas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Cliente;
import br.unifacisa.si.treinamento.SistemaVendas.exception.ClienteException;
import br.unifacisa.si.treinamento.SistemaVendas.respository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienterepository;
	
	
	public Cliente createCliente(Cliente c) throws ClienteException{
		if(c.getId() == null || c == null) {
			throw new ClienteException();}
		return clienterepository.save(c);
		
	}
	
	public ArrayList<Cliente> readAll(){
		return (ArrayList<Cliente>) clienterepository.findAll();
	}
	
	public Cliente readCliente(String id) throws ClienteException{
		if(!clienterepository.findById(id).isPresent()) {
			throw new ClienteException();
		}
		return clienterepository.findById(id).get();
	}
	
	public Cliente updateCliente(Cliente c) throws ClienteException {
		if(c.getId() == null || c.getNome() == null) {
			throw new ClienteException();
		}
		return clienterepository.save(c);
	}
	public Cliente deleteCliente(Cliente c) throws ClienteException{
		if(c == null || c.getId() == null) {
			throw new ClienteException();
		}
		clienterepository.deleteById(c.getId());
		return c;
	}

}
