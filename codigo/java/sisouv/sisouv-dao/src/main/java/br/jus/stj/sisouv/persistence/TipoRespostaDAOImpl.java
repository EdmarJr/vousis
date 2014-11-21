/**
 * 
 */
package br.jus.stj.sisouv.persistence;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.jus.stj.sisouv.entity.schemas.sisouv.TipoResposta;

/**
 * @author zainer.silva
 * 
 */
public class TipoRespostaDAOImpl extends GenericDAOMssqlImpl<TipoResposta>
		implements TipoRespostaDAO {

	@Override
	public TipoResposta obterPorNome(String nome) {
		Criteria criteria = obterCriteria(TipoResposta.class);
		criteria.add(Restrictions.eq("nomeTipoResposta", nome));
		return (TipoResposta) criteria.uniqueResult();
	}

}
