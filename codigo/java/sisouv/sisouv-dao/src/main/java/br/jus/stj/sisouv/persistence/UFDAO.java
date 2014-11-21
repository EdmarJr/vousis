/**
 * 
 */
package br.jus.stj.sisouv.persistence;

import java.util.List;

import br.jus.stj.sisouv.entity.schemas.dne.UF;

/**
 * @author zainer.silva
 * 
 */
public interface UFDAO extends GenericDAO<UF> {
	public List<UF> obterPorNome(String nome);
}
