/**
 * 
 */
package br.jus.stj.sisouv.persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.jus.stj.sisouv.entity.schemas.sisouv.TipoRelacionamento;

/**
 * @author zainer.silva
 * 
 */
public class TipoRelacionamentoDAOImpl extends
		GenericDAOMssqlImpl<TipoRelacionamento> implements
		TipoRelacionamentoDAO {

	@SuppressWarnings("unchecked")
	public List<TipoRelacionamento> obterPorNome(String nome) {
		Criteria criteria = obterCriteria(TipoRelacionamento.class);
		criteria.add(Restrictions.eq("nomeTipoRelacionamento", nome));
		return criteria.list();
	}
}
