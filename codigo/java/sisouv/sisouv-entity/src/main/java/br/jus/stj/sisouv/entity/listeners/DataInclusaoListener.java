package br.jus.stj.sisouv.entity.listeners;

import java.util.Date;

import javax.persistence.PrePersist;

import br.jus.stj.sisouv.entity.interfaces.EntidadeComDataInclusao;

public class DataInclusaoListener {

//	@PrePersist
	private void ajustarDataInclusao(EntidadeComDataInclusao entidade) {
		entidade.setDataInclusao(new Date());
	}
}
