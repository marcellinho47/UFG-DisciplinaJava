package br.com.kvmedia.entity;

import br.com.kvmedia.enuns.TipoContaEnum;

public abstract class Conta {

	private Integer nrConta;
	private Double saldo;
	private Pessoa cliente;
	private Integer tipoConta;

	/* ====================================================================================== */
	/* CONSTRUCTOR */
	/* ====================================================================================== */
	public Conta() {
		super();
		this.saldo = 0.0;
	}

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

	public TipoContaEnum getTipoConta() {
		return TipoContaEnum.toEnum(this.tipoConta);
	}

	public void setTipoConta(TipoContaEnum tipoConta) {
		this.tipoConta = tipoConta.getId();
	}

	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}

	/* ====================================================================================== */
	/* MÉTODOS AUXILIARES */
	/* ====================================================================================== */
	public Double sacar(Double valor) {

		if (temSaldo(valor)) {

			debitar(valor);
			return valor;

		} else {

			return 0.0;
		}
	}

	private void debitar(Double valor) {

		this.saldo = this.saldo - valor;
	}

	protected boolean temSaldo(Double valor) {

		return valor <= this.saldo ? true : false;
	}

	public Double depositar(Double valor) {

		this.saldo = this.saldo + valor;
		return this.saldo;
	}

	public void transferir(Double valor, Conta contaDestinoTransf) {

		if (valor > 0 && sacar(valor) != 0.0) {

			contaDestinoTransf.depositar(valor);
		}
	}
}
