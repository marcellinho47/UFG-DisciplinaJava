package br.com.kvmedia.entity;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private LocalDate dtNascimento;
	private String genero;

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	/* ====================================================================================== */
	/* MÉTODOS AUXILIARES */
	/* ====================================================================================== */
	public void getIdade() {

	}
}
