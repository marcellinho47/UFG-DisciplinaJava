package br.com.kvmedia.enuns;

public enum TipoContaEnum {

	SIMPLES(1, "Simples"), EXECUTIVA(2, "Executiva"), PREMIUM(3, "Premium"), PERSONALITE(4, "Personalité");

	private Integer id;
	private String descricao;

	private int id;
	private String description;

	/* ====================================================================================== */
	/* CONSTRUCTOR */
	/* ====================================================================================== */
	private TipoContaEnum(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	/* ====================================================================================== */
	/* GETTERS */
	/* ====================================================================================== */
	public String getDescricao() {
		return descricao;
	}

	public int getId() {
		return id;
	}

	/* ====================================================================================== */
	/* EXTRA METHODS */
	/* ====================================================================================== */
	public static TipoContaEnum toEnum(Integer id) {

		if (id == null) {
			return null;
		}

		for (TipoContaEnum tipo : TipoContaEnum.values()) {

			if (id.equals(tipo.getId())) {

				return tipo;
			}
		}

		throw new IllegalArgumentException("ID: " + id + " inválido.");
	}
}
