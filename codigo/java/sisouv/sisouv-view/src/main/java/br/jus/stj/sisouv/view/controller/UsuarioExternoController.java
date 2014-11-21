package br.jus.stj.sisouv.view.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;

import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioExterno;

@ManagedBean
@ViewScoped
public class UsuarioExternoController {

	private UsuarioExterno usuarioExterno;

	private boolean skip;

	@PostConstruct
	private void inicializar() {
		setUsuarioExterno(new UsuarioExterno());
	}

	public UsuarioExterno getUsuarioExterno() {
		return usuarioExterno;
	}

	public void setUsuarioExterno(UsuarioExterno usuarioExterno) {
		this.usuarioExterno = usuarioExterno;
	}

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public String onFlowProcess(FlowEvent event) {
		if (skip) {
			skip = false; // reset in case user goes back
			return "confirm";
		} else {
			return event.getNewStep();
		}
	}

}
