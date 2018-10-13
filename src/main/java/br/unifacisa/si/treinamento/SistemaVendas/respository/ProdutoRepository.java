package br.unifacisa.si.treinamento.SistemaVendas.respository;

import org.springframework.data.repository.CrudRepository;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, String>{

}
