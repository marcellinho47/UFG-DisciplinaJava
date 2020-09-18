package br.com.kvmedia.entity;

import java.time.LocalDateTime;

public class Historico {

	private Integer id;
	private Integer tipoOperacao;
	private Double valor;
	private LocalDateTime timestamp;

	/* ====================================================================================== */
	/* CONSTRUCTOR */
	/* ====================================================================================== */
	public Historico() {
		super();
	}

	public Historico(Integer id, Integer tipoOperacao, Double valor, LocalDateTime timestamp) {
		super();
		this.id = id;
		this.tipoOperacao = tipoOperacao;
		this.valor = valor;
		this.timestamp = timestamp;
	}

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(Integer tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}
