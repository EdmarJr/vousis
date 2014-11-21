package br.jus.stj.sisouv.business.tiporelacionamento;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.TipoRelacionamento;
import br.jus.stj.sisouv.persistence.TipoRelacionamentoDAO;

@Stateless
@LocalBean
public class TipoRelacionamentoBean extends Bean<TipoRelacionamento> {

	@Inject
	private TipoRelacionamentoDAO dao;

	public TipoRelacionamento obterPorNome(String nome) {
		List<TipoRelacionamento> tiposPorNome = dao.obterPorNome(nome);
		return tiposPorNome.size() > 0 ? tiposPorNome.get(0) : null;
	}

	@Override
	public TipoRelacionamentoDAO getDao() {
		return dao;
	}

	
}
