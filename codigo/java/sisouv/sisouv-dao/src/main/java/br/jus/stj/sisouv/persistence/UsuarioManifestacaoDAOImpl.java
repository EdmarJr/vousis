package br.jus.stj.sisouv.persistence;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;

public class UsuarioManifestacaoDAOImpl extends GenericDAOMssqlImpl<ManifestacaoUsuario>
		implements UsuarioManifestacaoDAO {

	public ManifestacaoUsuario obterPorId(Long id) {
		Criteria criteria = null;//obterCriteria(Manifestacao.class);
		criteria.add(Restrictions.eq("usuarioManifestacao.idUsuarioManifescao",
				id));
		return (ManifestacaoUsuario) criteria.uniqueResult();
	}

}
