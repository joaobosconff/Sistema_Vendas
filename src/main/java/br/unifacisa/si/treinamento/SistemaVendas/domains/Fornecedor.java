package br.unifacisa.si.treinamento.SistemaVendas.domains;

import java.time.LocalDate;



public class Fornecedor {
	
	private String nome;
	private Long telefone;
	private String email;
	private String cnpj;
	private LocalDate datadeContrato;
	private LocalDate vencimentoDeContrato;
	
	public Fornecedor(String nome, Long telefone, String email, String cnpj, LocalDate datadeContrato,
			LocalDate vencimentoDeContrato) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cnpj = cnpj;
		this.datadeContrato = datadeContrato;
		this.vencimentoDeContrato = vencimentoDeContrato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDatadeContrato() {
		return datadeContrato;
	}

	public void setDatadeContrato(LocalDate datadeContrato) {
		this.datadeContrato = datadeContrato;
	}

	public LocalDate getVencimentoDeContrato() {
		return vencimentoDeContrato;
	}

	public void setVencimentoDeContrato(LocalDate vencimentoDeContrato) {
		this.vencimentoDeContrato = vencimentoDeContrato;
	}
	
	

}
