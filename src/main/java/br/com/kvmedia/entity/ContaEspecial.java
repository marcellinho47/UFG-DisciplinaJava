package br.com.kvmedia.entity;

public class ContaEspecial extends Conta {

	private Double limite;

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	/* ====================================================================================== */
	/* M�TODOS AUXILIARES */
	/* ====================================================================================== */
	@Override
	protected boolean temSaldo(Double valor) {

		Double saldoConsolidado = this.limite + getSaldo();

		return valor <= saldoConsolidado ? true : false;
	}

	public void abrirConta(Pessoa cliente, Double limite) {

		setCliente(cliente);
		setLimite(limite);
	}
}
