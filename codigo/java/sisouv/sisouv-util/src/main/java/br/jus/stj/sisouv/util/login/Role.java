package br.jus.stj.sisouv.util.login;

import java.security.Principal;

public class Role implements Principal {
	private String name;

	public Role(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}