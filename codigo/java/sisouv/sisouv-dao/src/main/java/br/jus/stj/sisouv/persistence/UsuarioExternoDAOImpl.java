package br.jus.stj.sisouv.persistence;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioExterno;

public class UsuarioExternoDAOImpl extends GenericDAOMssqlImpl<UsuarioExterno>
		implements UsuarioExternoDAO {

	@Override
	public UsuarioExterno obterUsuarioExterno(String email, String hashSenha) {
		Criteria criteria = obterCriteria(UsuarioExterno.class);
		criteria.add(Restrictions.eq("txEmail", email));
		criteria.add(Restrictions.eq("txSenhaManifestante", hashSenha));
		return (UsuarioExterno) criteria.uniqueResult();
	}

	public UsuarioExterno obterUsuarioExternoPorLogin(String login) {
		Criteria criteria = obterCriteria(UsuarioExterno.class);
		criteria.add(Restrictions.eq("txEmail", login));
		return (UsuarioExterno) criteria.uniqueResult();
	}

}
