package br.jus.stj.sisouv.business.usuariomanifestacao;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;
import br.jus.stj.sisouv.persistence.UsuarioManifestacaoDAO;

@Stateless
public class UsuarioManifestacaoBean extends Bean<ManifestacaoUsuario> {

	@Inject
	private UsuarioManifestacaoDAO dao;

	@Override
	public UsuarioManifestacaoDAO getDao() {
		return dao;
	}

}
