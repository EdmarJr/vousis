//package br.jus.stj.sisouv.view.controller.login;
//
//import java.io.IOException;
//
//import javax.annotation.PostConstruct;
//import javax.ejb.EJB;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
//import javax.servlet.http.HttpSession;
//
//import br.jus.stj.sisouv.business.login.LoginBean;
//import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;
//import br.jus.stj.sisouv.view.controller.GenericController;
//
//@ManagedBean
//@ViewScoped
//public class LoginController extends GenericController {
//
//	private static final long serialVersionUID = 8149488438145174830L;
//
//	private String usuario;
//
//	private String senha;
//
//	private String dialogMensagem;
//
//	private boolean exibeMensagem;
//
//	@EJB
//	private LoginBean loginBean;
//
//	private final static String PAGE_LOGIN_SUCESSO = "cadastroManifestacaoWizard.jsf";
//
//	@PostConstruct
//	public void init() {
//
//	}
//
//	public String comandoEntrar() {
//		ManifestacaoUsuario manifestacaoUsuario = loginBean.efetuarLogin(
//				getUsuario(), getSenha());
//
//		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
//				.getExternalContext().getSession(true);
//		session.setAttribute("usuarioManifestacao", manifestacaoUsuario);
//
//		if (manifestacaoUsuario == null) {
//			setSenha("");
//			setExibeMensagem(true);
//			dialogMensagem = getMensagem("msg", "msg.login.dados.invalidos");
//			return null;
//		}
//
//		try {
//			FacesContext.getCurrentInstance().getExternalContext()
//					.redirect(PAGE_LOGIN_SUCESSO);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return PAGE_LOGIN_SUCESSO;
//	}
//
//	public void logOut() {
//		FacesContext fc = FacesContext.getCurrentInstance();
//		HttpSession session = (HttpSession) fc.getExternalContext().getSession(
//				false);
//		session.invalidate();
//	}
//
//	public void logOutERedirecionarParaPaginaInicial() {
//		logOut();
//		try {
//			FacesContext.getCurrentInstance().getExternalContext()
//					.redirect("/sisouv");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public String getUsuario() {
//		return usuario;
//	}
//
//	public void setUsuario(String usuario) {
//		this.usuario = usuario;
//	}
//
//	public String getSenha() {
//		return senha;
//	}
//
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
//
//	public String getDialogMensagem() {
//		return dialogMensagem;
//	}
//
//	public void setDialogMensagem(String dialogMensagem) {
//		this.dialogMensagem = dialogMensagem;
//	}
//
//	public boolean isExibeMensagem() {
//		return exibeMensagem;
//	}
//
//	public void setExibeMensagem(boolean exibeMensagem) {
//		this.exibeMensagem = exibeMensagem;
//	}
//
//}
