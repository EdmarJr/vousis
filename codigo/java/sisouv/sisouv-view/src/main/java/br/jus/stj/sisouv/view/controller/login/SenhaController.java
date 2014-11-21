//package br.jus.stj.sisouv.view.controller.login;
//
//import java.io.IOException;
//
//import javax.ejb.EJB;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
//
//import br.jus.stj.sisouv.business.login.LoginBean;
//import br.jus.stj.sisouv.email.EmailService;
//
//@ManagedBean
//@ViewScoped
//public class SenhaController {
//	public String email;
//
//	@EJB
//	private EmailService emailService;
//	@EJB
//	private LoginBean loginBean;
//
//	public void comandoEsqueciMinhaSenha(String email) {
//		loginBean.esqueciMinhaSenha(email);
//		if (FacesContext.getCurrentInstance().getMessageList().size() != 0) {
//			return;
//		}
//		try {
//			FacesContext
//					.getCurrentInstance()
//					.getExternalContext()
//					.redirect(
//							"/sisouv/faces/logado/manifestacao/manifestacao.jsf");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//}
