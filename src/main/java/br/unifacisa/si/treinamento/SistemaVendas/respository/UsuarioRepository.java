package br.unifacisa.si.treinamento.SistemaVendas.respository;

import org.springframework.data.repository.CrudRepository;

import br.unifacisa.si.treinamento.SistemaVendas.domains.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}
