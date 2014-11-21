package br.jus.stj.sisouv.business.profissao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.Profissao;
import br.jus.stj.sisouv.persistence.ProfissaoDAO;

@Stateless
@LocalBean
public class ProfissaoBean extends Bean<Profissao> {

	@Inject
	private ProfissaoDAO dao;

	@Override
	public ProfissaoDAO getDao() {
		return dao;
	}


}
