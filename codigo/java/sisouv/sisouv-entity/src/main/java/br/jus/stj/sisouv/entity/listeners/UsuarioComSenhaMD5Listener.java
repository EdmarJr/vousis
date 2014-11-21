package br.jus.stj.sisouv.entity.listeners;

import javax.persistence.PrePersist;

import br.jus.stj.commons.util.HashUtils;
import br.jus.stj.sisouv.entity.interfaces.UsuarioComSenha;

public class UsuarioComSenhaMD5Listener {

//	@PrePersist
	public void incluir(UsuarioComSenha usuarioComSenha) {
		usuarioComSenha.setSenha(HashUtils.gerarHashPorMD5(usuarioComSenha
				.getSenha()));
	}
}
