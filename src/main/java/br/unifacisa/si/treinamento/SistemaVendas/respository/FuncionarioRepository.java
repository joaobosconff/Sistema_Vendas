package br.unifacisa.si.treinamento.SistemaVendas.respository;

import org.springframework.data.repository.CrudRepository;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, String> {

}
