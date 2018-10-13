package br.unifacisa.si.treinamento.SistemaVendas.respository;

import org.springframework.data.repository.CrudRepository;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Marca;

public interface MarcaRepository extends CrudRepository<Marca, String>{

}
