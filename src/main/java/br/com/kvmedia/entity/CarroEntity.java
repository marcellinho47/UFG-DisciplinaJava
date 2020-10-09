package br.com.kvmedia.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Carros")
public class CarroEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Carro")
	private Integer idCarro;

	@Column(name = "NUMR_TipoCarro")
	private Integer tipoCarro;

	@Column(name = "DESC_Placa")
	private String placa;

	@Column(name = "NUMR_Ano")
	private Integer ano;

	@Column(name = "DESC_Cor")
	private String cor;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_Modelo")
	private ModeloEntity modelo;

	/* ====================================================================================== */
	/* CONSTRUCTOR */
	/* ====================================================================================== */
	public CarroEntity() {
		super();
	}

	public CarroEntity(Integer idCarro, Integer tipoCarro, String placa, Integer ano, String cor, ModeloEntity modelo) {
		super();
		this.idCarro = idCarro;
		this.tipoCarro = tipoCarro;
		this.placa = placa;
		this.ano = ano;
		this.cor = cor;
		this.modelo = modelo;
	}

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public Integer getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}

	public Integer getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(Integer tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public ModeloEntity getModelo() {
		return modelo;
	}

	public void setModelo(ModeloEntity modelo) {
		this.modelo = modelo;
	}

	/* ====================================================================================== */
	/* HASHCODE AND EQUALS */
	/* ====================================================================================== */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((idCarro == null) ? 0 : idCarro.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((tipoCarro == null) ? 0 : tipoCarro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarroEntity other = (CarroEntity) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (idCarro == null) {
			if (other.idCarro != null)
				return false;
		} else if (!idCarro.equals(other.idCarro))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (tipoCarro == null) {
			if (other.tipoCarro != null)
				return false;
		} else if (!tipoCarro.equals(other.tipoCarro))
			return false;
		return true;
	}
}
