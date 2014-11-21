package br.jus.stj.sisouv.entity.vo;

public class LinkVO {

	private String descricao;
	
	private String acao;

	public LinkVO(String descricao, String acao) {
		super();
		this.descricao = descricao;
		this.acao = acao;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getAcao() {
		return acao;
	}

	@Override
	public String toString() {
		return descricao;
	}
	
}
