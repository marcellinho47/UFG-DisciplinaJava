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

		Double valorCorregido = this.getSaldo() * (this.txCorrecao / 100);
		depositar(valorCorregido);
	}

	public void abrirConta(Pessoa cliente, Double txCorrecao) {

		setCliente(cliente);
		setTxCorrecao(txCorrecao);
	}
}
