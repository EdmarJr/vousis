package br.jus.stj.sisouv.entity.enumerators;

import br.jus.stj.sisouv.entity.schemas.sisouv.Usuario;
import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioExterno;
import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioInterno;

public enum TipoUsuarioLogin {
	I("Interno", UsuarioInterno.class), E("Externo", UsuarioExterno.class);

	private Class<?> classe;
	private String descricao;

	private TipoUsuarioLogin(String descricao, Class<?> classe) {
		this.descricao = descricao;
		this.classe = classe;
	}

	public Class<?> getClasse() {
		return classe;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoUsuarioLogin obterTipoUsuarioLogin(Usuario usuario) {
		if (usuario instanceof UsuarioInterno) {
			return TipoUsuarioLogin.I;
		}
		return TipoUsuarioLogin.E;
	}

}
