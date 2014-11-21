package br.jus.stj.sisouv.business.tiporesposta;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.TipoResposta;
import br.jus.stj.sisouv.persistence.TipoRespostaDAO;

@Stateless
@LocalBean
public class TipoRespostaBean extends Bean<TipoResposta> {

	@Inject
	private TipoRespostaDAO dao;

	public TipoResposta obterPorNome(String nome) {
		return dao.obterPorNome(nome);
	}

	@Override
	public TipoRespostaDAO getDao() {
		return dao;
	}


}
