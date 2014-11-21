package br.jus.stj.sisouv.business.tipomanifestacao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.TipoManifestacao;
import br.jus.stj.sisouv.persistence.TipoManifestacaoDAO;

@Stateless
@LocalBean
public class TipoManifestacaoBean extends Bean<TipoManifestacao> {

	@Inject
	private TipoManifestacaoDAO dao;

	@Override
	public TipoManifestacaoDAO getDao() {
		return dao;
	}

}
