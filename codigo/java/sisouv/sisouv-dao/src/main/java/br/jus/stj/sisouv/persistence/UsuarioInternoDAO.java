package br.jus.stj.sisouv.persistence;

import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioInterno;

public interface UsuarioInternoDAO extends GenericDAO<UsuarioInterno> {
	public UsuarioInterno obterUsuarioPorLogin(String login);
}
