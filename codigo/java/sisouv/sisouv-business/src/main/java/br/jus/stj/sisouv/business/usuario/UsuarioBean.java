package br.jus.stj.sisouv.business.usuario;

import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.Usuario;
import br.jus.stj.sisouv.persistence.UsuarioDAO;

public class UsuarioBean extends Bean<Usuario> {

	@Inject
	private UsuarioDAO dao;

	@Override
	public UsuarioDAO getDao() {
		return dao;
	}

}
