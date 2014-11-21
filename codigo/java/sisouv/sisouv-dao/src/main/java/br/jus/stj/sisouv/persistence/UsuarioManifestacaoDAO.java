package br.jus.stj.sisouv.persistence;

import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;

public interface UsuarioManifestacaoDAO extends GenericDAO<ManifestacaoUsuario> {

	ManifestacaoUsuario obterPorId(Long id);

}
