package br.jus.stj.sisouv.business;

import java.util.List;

import br.jus.stj.sisouv.entity.EntidadeBase;
import br.jus.stj.sisouv.persistence.GenericDAO;

public abstract class Bean<T> {
	public void incluir(T entidade) {
		getDao().incluir(entidade);
	}

	public void alterar(T entidade) {
		getDao().atualizar(entidade);
	}

	public void excluir(T entidade) {
		getDao().excluir(entidade);
	}

	public List<T> filtrar(T entidade) {
		return getDao().filtrar(entidade);
	}

	public List<T> recuperarTodos(Class<T> clazz) {
		return getDao().recuperarTodos(clazz);
	}

	public abstract GenericDAO<T> getDao();
}
