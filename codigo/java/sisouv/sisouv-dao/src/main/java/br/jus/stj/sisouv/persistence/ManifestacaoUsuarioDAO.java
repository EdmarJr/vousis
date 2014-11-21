package br.jus.stj.sisouv.persistence;

import java.util.List;

import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;
import br.jus.stj.sisouv.entity.schemas.sisouv.Usuario;

public interface ManifestacaoUsuarioDAO extends GenericDAO<ManifestacaoUsuario> {

	public List<ManifestacaoUsuario> obterManifestacaoPorUsuario(
			Long idManifestacaoUsuario, Usuario usuario);

}
