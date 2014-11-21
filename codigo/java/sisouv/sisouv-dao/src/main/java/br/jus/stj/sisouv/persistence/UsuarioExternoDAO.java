package br.jus.stj.sisouv.persistence;

import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioExterno;

public interface UsuarioExternoDAO extends GenericDAO<UsuarioExterno> {

	public UsuarioExterno obterUsuarioExterno(String email, String hashSenha);

	public UsuarioExterno obterUsuarioExternoPorLogin(String login);

}
