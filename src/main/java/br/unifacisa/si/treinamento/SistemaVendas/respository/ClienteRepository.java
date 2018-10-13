package br.unifacisa.si.treinamento.SistemaVendas.respository;

import org.springframework.data.repository.CrudRepository;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
