package br.unifacisa.si.treinamento.SistemaVendas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Produto;
import br.unifacisa.si.treinamento.SistemaVendas.exception.ProdutoException;
import br.unifacisa.si.treinamento.SistemaVendas.respository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtorepository;
	
	
	
	public Produto createProduto(Produto p) throws ProdutoException{
		if(p.getId() == null || p == null) {
			throw new ProdutoException();}
		return produtorepository.save(p);
		
	}
	
	public ArrayList<Produto> readAll(){
		return (ArrayList<Produto>) produtorepository.findAll();
	}
	
	public Produto readProduto(String id) throws ProdutoException{
		if(!produtorepository.findById(id).isPresent()) {
			throw new ProdutoException();
		}
		return produtorepository.findById(id).get();
	}
	
	public Produto updateProduto(Produto p) throws ProdutoException {
		if(p.getId() == null || p.getNome() == null) {
			throw new ProdutoException();
		}
		return produtorepository.save(p);
	}
	public Produto deleteProduto(Produto p) throws ProdutoException{
		if(p == null || p.getId() == null) {
			throw new ProdutoException();
		}
		produtorepository.deleteById(p.getId());
		return p;
	}
}
