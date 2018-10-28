package br.unifacisa.si.treinamento.SistemaVendas.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.unifacisa.si.treinamento.SistemaVendas.controllers.CategoriaController;

class CategoriaTest {
	@Autowired
	private Categoria Categoria;
	
	@Autowired
	private CategoriaController controller;



	
	@Test
	public void testAdd() {
		controller.createCategoria(categoria);
		Assert.assertEquals(categoria,controller.createCategoria(categoria.));
		
		
	}

}
