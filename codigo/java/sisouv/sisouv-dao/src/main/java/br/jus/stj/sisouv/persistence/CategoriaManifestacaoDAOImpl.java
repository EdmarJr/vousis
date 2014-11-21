package br.jus.stj.sisouv.persistence;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.jus.stj.sisouv.entity.schemas.sisouv.CategoriaManifestacao;

public class CategoriaManifestacaoDAOImpl extends
		GenericDAOMssqlImpl<CategoriaManifestacao> implements
		CategoriaManifestacaoDAO {

	@Override
	public CategoriaManifestacao obterPorNome(String nome) {
		Criteria criteria = obterCriteria(CategoriaManifestacao.class);
		criteria.add(Restrictions.eq("nomeManifestacao", nome));
		return (CategoriaManifestacao) criteria.uniqueResult();
	}

}
