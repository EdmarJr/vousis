package br.jus.stj.sisouv.persistence;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioInterno;

public class UsuarioInternoDAOImpl extends GenericDAOMssqlImpl<UsuarioInterno>
		implements UsuarioInternoDAO {

	@Override
	public UsuarioInterno obterUsuarioPorLogin(String login) {
		Criteria criteria = obterCriteria(UsuarioInterno.class);
		Criteria criteriaLoginStj = criteria.createCriteria("loginStj");
		criteriaLoginStj.add(Restrictions.eq("nomeNick", login));
		return (UsuarioInterno) criteria.uniqueResult();
	}
}
