package br.unifacisa.si.treinamento.SistemaVendas.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FuncionarioException extends Exception {

}
