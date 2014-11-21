package br.jus.stj.sisouv.business.categoriamanifestacao;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.jus.stj.sisouv.business.Bean;
import br.jus.stj.sisouv.entity.schemas.sisouv.CategoriaManifestacao;
import br.jus.stj.sisouv.persistence.CategoriaManifestacaoDAO;
import br.jus.stj.sisouv.persistence.GenericDAO;

@Stateless
public class CategoriaManifestacaoBean extends Bean<CategoriaManifestacao> {

	@Inject
	private CategoriaManifestacaoDAO dao;


	public CategoriaManifestacao obterPorNome(String nome) {
		return dao.obterPorNome(nome);

	}

	@Override
	public GenericDAO<CategoriaManifestacao> getDao() {
		return dao;
	}

}
