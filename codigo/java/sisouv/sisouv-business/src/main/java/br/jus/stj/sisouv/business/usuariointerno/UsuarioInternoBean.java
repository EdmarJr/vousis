package br.jus.stj.sisouv.business.usuariointerno;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioInterno;
import br.jus.stj.sisouv.persistence.UsuarioInternoDAO;

@Stateless
@LocalBean
public class UsuarioInternoBean extends Bean<UsuarioInterno> {
	@Inject
	private UsuarioInternoDAO dao;

	public UsuarioInterno obterUsuarioPorLogin(String login) {
		return dao.obterUsuarioPorLogin(login);
	}

	@Override
	public UsuarioInternoDAO getDao() {
		return dao;
	}
}
