package br.com.kvmedia.entity;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String atividade;

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
}
