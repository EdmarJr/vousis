package br.jus.stj.sisouv.business.pronometratamento;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.PronomeTratamento;
import br.jus.stj.sisouv.persistence.PronomeTratamentoDAO;

@Stateless
@LocalBean
public class PronomeTratamentoBean extends Bean<PronomeTratamento> {

	@Inject
	private PronomeTratamentoDAO dao;

	@Override
	public PronomeTratamentoDAO getDao() {
		return dao;
	}

}
