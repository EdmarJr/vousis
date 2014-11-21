/**
 * 
 */
package br.jus.stj.sisouv.persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.jus.stj.sisouv.entity.schemas.dne.UF;

/**
 * @author zainer.silva
 * 
 */
public class UFDAOImpl extends GenericDAOMssqlImpl<UF> implements UFDAO {

	@Override
	public List<UF> obterPorNome(String nome) {
		Criteria criteria = obterCriteria(UF.class);
		criteria.add(Restrictions.eq("siglaUF", nome));
		return criteria.list();
	}

}
