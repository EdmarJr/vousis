/**
 * 
 */
package br.jus.stj.sisouv.persistence;

import br.jus.stj.sisouv.entity.schemas.sisouv.TipoResposta;

/**
 * @author zainer.silva
 * 
 */
public interface TipoRespostaDAO extends GenericDAO<TipoResposta> {
	public TipoResposta obterPorNome(String nome);
}
