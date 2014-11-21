package br.jus.stj.sisouv.entity.enumerators;

public enum CategoriaManifestacaoEnum {
	LAI("LAI", 1L), OUVIDORIA("OUVIDORIA", 2L);

	private Long codigo;
	private String descricao;

	private CategoriaManifestacaoEnum(String descricao, Long codigo) {
		this.descricao = descricao;
		this.codigo = codigo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
