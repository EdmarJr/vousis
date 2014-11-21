/**
 * 
 */
package br.jus.stj.sisouv.persistence;

import java.util.List;

import br.jus.stj.sisouv.entity.schemas.sisouv.TipoRelacionamento;

/**
 * @author zainer.silva
 * 
 */
public interface TipoRelacionamentoDAO extends GenericDAO<TipoRelacionamento> {

	List<TipoRelacionamento> obterPorNome(String nome);

}
