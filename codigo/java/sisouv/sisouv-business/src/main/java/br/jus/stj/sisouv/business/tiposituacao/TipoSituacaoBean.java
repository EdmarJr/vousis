package br.jus.stj.sisouv.business.tiposituacao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.TipoSituacao;
import br.jus.stj.sisouv.persistence.GenericDAO;
import br.jus.stj.sisouv.persistence.TipoSituacaoDAO;

@Stateless
@LocalBean
public class TipoSituacaoBean extends Bean<TipoSituacao> {

	@Inject
	private TipoSituacaoDAO dao;

	@Override
	public GenericDAO<TipoSituacao> getDao() {
		return dao;
	}

}
