package br.com.kvmedia.entity;

public class Pessoa {

	private Integer id;
	private String nome;
	private String endereco;

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
