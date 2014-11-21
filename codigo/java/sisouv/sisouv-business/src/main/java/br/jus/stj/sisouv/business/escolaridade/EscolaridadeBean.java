package br.jus.stj.sisouv.business.escolaridade;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.Escolaridade;
import br.jus.stj.sisouv.persistence.EscolaridadeDAO;

@Stateless
@LocalBean
public class EscolaridadeBean extends Bean<Escolaridade> {

	@Inject
	private EscolaridadeDAO dao;


	@Override
	public EscolaridadeDAO getDao() {
		
		return dao;

	}

	
}
