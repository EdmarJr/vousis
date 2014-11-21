//package br.jus.stj.sisouv.business.login;
//
//import javax.annotation.Resource;
//import javax.ejb.EJB;
//import javax.ejb.LocalBean;
//import javax.ejb.SessionContext;
//import javax.ejb.Stateless;
//
//import br.jus.stj.commons.ldap.AutenticadorLdap;
//import br.jus.stj.commons.ldap.vo.UsuarioVO;
//import br.jus.stj.commons.util.HashUtils;
//import br.jus.stj.commons.util.MensagemUtil;
//import br.jus.stj.sisouv.business.usuarioexterno.UsuarioExternoBean;
//import br.jus.stj.sisouv.business.usuariointerno.UsuarioInternoBean;
//import br.jus.stj.sisouv.email.EmailService;
//import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;
//import br.jus.stj.sisouv.entity.schemas.sisouv.Usuario;
//import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioExterno;
//import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioInterno;
//
//@Stateless
//@LocalBean
//public class LoginBean {
//	@EJB
//	private UsuarioExternoBean usuarioExternoBean;
//	@EJB
//	private UsuarioInternoBean usuarioInternoBean;
//	@EJB
//	private EmailService emailService;
//	@Resource
//	private SessionContext sessionContext;
//
//	private AutenticadorLdap autenticadorLdap = null;
//
//	private final static String SUFIXO_EMAIL_STJ = "@stj.jus.br";
//
//	public LoginBean() {
//		autenticadorLdap = new AutenticadorLdap();
//	}
//
//	public ManifestacaoUsuario efetuarLogin(String usuario, String senha) {
//		usuario = usuario.trim().toLowerCase();
//		if (isUsuarioInterno(usuario)) {
//			return efetuarLoginUsuarioInterno(usuario, senha);
//		} else {
//			return efetuarLoginUsuarioExterno(usuario, senha);
//		}
//	}
//
//	private ManifestacaoUsuario efetuarLoginUsuarioExterno(String usuario,
//			String senha) {
//		String hashSenha = HashUtils.gerarHashPorMD5(senha);
//		UsuarioExterno usuarioExterno = usuarioExternoBean.obterUsuarioExterno(
//				usuario, hashSenha);
//		return usuarioExterno != null ? usuarioExterno.getManifestacaoUsuario()
//				: null;
//	}
//
//	private ManifestacaoUsuario efetuarLoginUsuarioInterno(String usuario,
//			String senha) {
//		usuario = removerSufixoEmailStj(usuario);
//		UsuarioVO usuarioVO = new UsuarioVO(usuario, senha);
//		boolean autenticado = autenticadorLdap.autenticarUsuario(usuarioVO);
//		if (!autenticado)
//			return null;
//
//		ManifestacaoUsuario usuarioManifestante = new ManifestacaoUsuario();
//		UsuarioInterno usuarioInterno = new UsuarioInterno();
//		usuarioInterno.setNomeUsuarioInterno(usuario);
//		return usuarioManifestante;
//	}
//
//	public boolean isUsuarioInterno(String usuario) {
//		if (usuario.endsWith(SUFIXO_EMAIL_STJ) || usuario.indexOf("@") == -1)
//			return true;
//		else
//			return false;
//	}
//
//	private String removerSufixoEmailStj(String usuario) {
//		return usuario.substring(0,
//				usuario.length() - SUFIXO_EMAIL_STJ.length());
//	}
//
//	public Usuario obterUsuarioLogado() {
//		String login = sessionContext.getCallerPrincipal().getName();
//		if (sessionContext.getCallerPrincipal() == null
//				|| sessionContext.getCallerPrincipal().getName() == null) {
//			return null;
//		}
//		if (isUsuarioInterno(login)) {
//			return usuarioInternoBean.obterUsuarioPorLogin(login);
//		}
//		return usuarioExternoBean.obterUsuarioExternoPorLogin(login);
//	}
//
//	public void esqueciMinhaSenha(String email) {
//		if (email.indexOf("@") == -1) {
//			MensagemUtil.adicionarMensagemErro("msg", "msg004");
//			return;
//		}
//
//		if (isUsuarioInterno(email)) {
//			UsuarioInterno usuario = usuarioInternoBean
//					.obterUsuarioPorLogin(email);
//			if (usuario == null) {
//				MensagemUtil.adicionarMensagemErro("msg", "msg004");
//				return;
//			}
//		} else {
//			UsuarioExterno usuarioExterno = usuarioExternoBean
//					.obterUsuarioExternoPorLogin(email);
//			String novaSenha = gerarNovaSenhaUsuarioExterno(usuarioExterno);
//			usuarioExternoBean.alterar(usuarioExterno);
//			enviarEmailComSenhaAtualUsuario(email, novaSenha);
//		}
//	}
//
//	private String gerarNovaSenhaUsuarioExterno(UsuarioExterno usuarioExterno) {
//		String senhaUsuario = usuarioExterno.getSenha();
//		String novaSenha = senhaUsuario.substring(0,
//				senhaUsuario.length() > 8 ? 8 : senhaUsuario.length());
//		usuarioExterno.setSenha(HashUtils.gerarHashPorMD5(novaSenha));
//		return novaSenha;
//	}
//
//	private void enviarEmailComSenhaAtualUsuario(String email, String senhaEnvio) {
//		String mensagemEmail = "Sua nova senha para acessar o sistema SISOUV é: "
//				+ senhaEnvio;
//		String assuntoEmail = "Senha acesso SISOUV";
//		emailService.enviarEmail(email, assuntoEmail, mensagemEmail);
//	}
//}
