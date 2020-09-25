package br.com.kvmedia.entity;

public class Modelo {

	private Integer idModelo;
	private String descModelo;
	private Fabricante fabricante;

	/* ====================================================================================== */
	/* CONSTRUCTOR */
	/* ====================================================================================== */
	public Modelo() {
		super();
	}

	public Modelo(Integer idModelo, String descModelo, Fabricante fabricante) {
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

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
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
		Modelo other = (Modelo) obj;
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
