package br.jus.stj.sisouv.persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;
import br.jus.stj.sisouv.entity.schemas.sisouv.Usuario;

public class ManifestacaoUsuarioDAOImpl extends
		GenericDAOMssqlImpl<ManifestacaoUsuario> implements
		ManifestacaoUsuarioDAO {

	@Override
	public List<ManifestacaoUsuario> obterManifestacaoPorUsuario(
			Long idManifestacaoUsuario, Usuario usuario) {

		Criteria criteria = obterCriteria(ManifestacaoUsuario.class);
		Criteria criteriaManifestacaoUsuario = criteria
				.createCriteria("manifestacaoUsuario");

		if (idManifestacaoUsuario != null) {
			criteriaManifestacaoUsuario.add(Restrictions.eq(
					"idManifestacaoUsuario", idManifestacaoUsuario));
			return criteria.list();
		}

		criteriaManifestacaoUsuario.add(Restrictions.eq("usuario", usuario));
		return criteria.list();

	}

}
