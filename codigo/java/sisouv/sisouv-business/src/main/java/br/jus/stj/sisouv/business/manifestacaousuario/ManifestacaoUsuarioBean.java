package br.jus.stj.sisouv.business.manifestacaousuario;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;
import br.jus.stj.sisouv.persistence.ManifestacaoUsuarioDAO;

@Stateless
@LocalBean
public class ManifestacaoUsuarioBean extends Bean<ManifestacaoUsuario> {

	@Inject
	private ManifestacaoUsuarioDAO dao;

	@Override
	public ManifestacaoUsuarioDAO getDao() {
		return dao;
	}


}
