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
@Table(name = "Modelos")
public class ModeloEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Modelo")
	private Integer idModelo;

	@Column(name = "DESC_Modelo")
	private String descModelo;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_Fabricante")
	private FabricanteEntity fabricante;

	/* ====================================================================================== */
	/* CONSTRUCTOR */
	/* ====================================================================================== */
	public ModeloEntity() {
		super();
	}

	public ModeloEntity(Integer idModelo, String descModelo, FabricanteEntity fabricante) {
		super();
		this.idModelo = idModelo;
		this.descModelo = descModelo;
		this.fabricante = fabricante;
	}

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public Integer getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Integer idModelo) {
		this.idModelo = idModelo;
	}

	public String getDescModelo() {
		return descModelo;
	}

	public void setDescModelo(String descModelo) {
		this.descModelo = descModelo;
	}

	public FabricanteEntity getFabricante() {
		return fabricante;
	}

	public void setFabricante(FabricanteEntity fabricante) {
		this.fabricante = fabricante;
	}

	/* ====================================================================================== */
	/* HASHCOD AND EQUALS */
	/* ====================================================================================== */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descModelo == null) ? 0 : descModelo.hashCode());
		result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((idModelo == null) ? 0 : idModelo.hashCode());
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
		ModeloEntity other = (ModeloEntity) obj;
		if (descModelo == null) {
			if (other.descModelo != null)
				return false;
		} else if (!descModelo.equals(other.descModelo))
			return false;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (idModelo == null) {
			if (other.idModelo != null)
				return false;
		} else if (!idModelo.equals(other.idModelo))
			return false;
		return true;
	}
}
