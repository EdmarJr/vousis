package br.jus.stj.sisouv.persistence;

import br.jus.stj.sisouv.entity.schemas.sisouv.CategoriaManifestacao;

public interface CategoriaManifestacaoDAO extends
		GenericDAO<CategoriaManifestacao> {

	CategoriaManifestacao obterPorNome(String nome);

}
