package br.com.kvmedia.entity;

public class ContaPoupanca extends Conta {

	private Double txCorrecao;

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public Double getTxCorrecao() {
		return txCorrecao;
	}

	public void setTxCorrecao(Double txCorrecao) {
		this.txCorrecao = txCorrecao;
	}

	/* ====================================================================================== */
	/* MÉTODOS AUXILIARES */
	/* ====================================================================================== */
	public void atualizaSaldoRendimento() {

	}

	public void abrirConta() {

	}
}
