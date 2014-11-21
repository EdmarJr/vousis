package br.jus.stj.sisouv.view.controller;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.HttpServletRequest;

import br.jus.stj.commons.util.MensagemUtil;

public abstract class GenericController implements Serializable {

	private static final long serialVersionUID = -2162249893778518423L;

	private String paginaDestino;

	public String getMensagem(String bundleName, String key) {
		return MensagemUtil.getMensagem(bundleName, key);
	}
	
	public void redirect(String caminho) {

		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(getRequest().getContextPath() + caminho);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
	
	private HttpServletRequest getRequest() {

		return (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();

	}

	public boolean validarDataInicioMenorQueDataFim(Date inicio, Date fim,
			String nomeHint) throws ValidatorException {
		if (inicio != null && fim != null) {
			if (inicio.after(fim)) {
				FacesMessage msg = new FacesMessage(getMensagem("msg",
						"msg.msg026.datafimmenordatainicio"));
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
				FacesContext.getCurrentInstance().addMessage(
						nomeHint,
						new FacesMessage(FacesMessage.SEVERITY_WARN,
								getMensagem("msg",
										"msg.msg026.datafimmenordatainicio"),
								getMensagem("msg",
										"msg.msg026.datafimmenordatainicio")));
				return false;
			}
		}
		return true;
	}

	public void abrirModal(String widgetVar) {
		org.primefaces.context.RequestContext.getCurrentInstance().execute(
				widgetVar + ".show();");
	}

	public void fecharModal(String widgetVar) {
		org.primefaces.context.RequestContext.getCurrentInstance().execute(
				widgetVar + ".hide();");
	}

	public String getPaginaDestino() {
		return paginaDestino;
	}

	public void setPaginaDestino(String paginaDestino) {
		this.paginaDestino = paginaDestino;
	}

}
