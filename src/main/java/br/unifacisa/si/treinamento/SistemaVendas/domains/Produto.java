package br.unifacisa.si.treinamento.SistemaVendas.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto {

	@Id
	private String id;
	
	
	private String nome;
	private Marca marca;
	private Categoria categoria;
	private Double valor;
	private Integer quantidade;
	
	
	
	
	public Produto(String nome, Marca marca, Categoria categoria, Double valor, Integer quantidade) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.categoria = categoria;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	
	
	
}
