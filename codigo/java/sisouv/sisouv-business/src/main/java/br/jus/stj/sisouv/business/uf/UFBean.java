package br.jus.stj.sisouv.business.uf;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.dne.UF;
import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioInterno;
import br.jus.stj.sisouv.persistence.UFDAO;

@Stateless
@LocalBean
public class UFBean extends Bean<UF> {

	@Inject
	private UFDAO uFDAO;

	public List<UF> obterPorNome(String nome) {
		return getDao().obterPorNome(nome);
	}

	@Override
	public UFDAO getDao() {
		return uFDAO;
	}

	public UF obterUfDeUmUsuarioInterno(UsuarioInterno usuario) {
//		List<UF> ufsRetornadas = getDao().obterPorNome(
//				usuario.getLoginStj().getServidor().getUf());
//		UF uf = ufsRetornadas.size() > 0 ? ufsRetornadas.get(0) : null;
//		return uf;
		return null;
	}

}
