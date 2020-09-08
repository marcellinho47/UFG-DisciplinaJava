package br.com.kvmedia.entity;

public class Conta {

	private Integer nrConta;
	private Double saldo;
	private Pessoa cliente;

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public Integer getNrConta() {
		return nrConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	/* ====================================================================================== */
	/* MÉTODOS AUXILIARES */
	/* ====================================================================================== */
	public void sacar() {

	}

	private void debitar() {

	}

	protected void temSaldo() {

	}

	public void depositar() {

	}

	public void transferir() {

	}
}
