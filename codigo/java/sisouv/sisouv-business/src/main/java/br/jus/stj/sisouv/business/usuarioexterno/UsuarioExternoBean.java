//package br.jus.stj.sisouv.business.usuarioexterno;
//
//import javax.ejb.EJB;
//import javax.ejb.LocalBean;
//import javax.ejb.Stateless;
//import javax.inject.Inject;
//
//import br.gov.cjf.webservice.CPF;
//import br.jus.stj.commons.util.MensagemUtil;
//import br.jus.stj.sisouv.business.Bean;
//import br.jus.stj.sisouv.business.cpf.CPFService;
//import br.jus.stj.sisouv.entity.enumerators.TipoUsuarioLogin;
//import br.jus.stj.sisouv.entity.schemas.sisouv.Usuario;
//import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioExterno;
//import br.jus.stj.sisouv.persistence.UsuarioExternoDAO;
//
//@Stateless
//@LocalBean
//public class UsuarioExternoBean extends Bean<UsuarioExterno> {
//	@Inject
//	private UsuarioExternoDAO dao;
//	@EJB
//	private CPFService cpfService;
//
//	private final static String SUFIXO_EMAIL_STJ = "@stj.jus.br";
//
//	public UsuarioExterno obterUsuarioExterno(String email, String hashSenha) {
//		return dao.obterUsuarioExterno(email, hashSenha);
//	}
//
//	private Boolean seEmailInvalido(UsuarioExterno entidade) {
//		if (entidade.getTxEmail().indexOf(SUFIXO_EMAIL_STJ) != -1) {
//			MensagemUtil.adicionarMensagemErro("msg", "msg004");
//			return Boolean.TRUE;
//		}
//		return Boolean.FALSE;
//	}
//
//	private Boolean seJaExisteUsuarioComMesmoEmail(UsuarioExterno entidade) {
//		Usuario usuario = obterUsuarioExternoPorLogin(entidade.getTxEmail());
//		if ((entidade.getId() == null && usuario != null)
//				|| (usuario != null && usuario.getId().toString()
//						.equals(entidade.getId()))) {
//			MensagemUtil.adicionarMensagemErro("email", "msg", "msg00x");
//			return Boolean.TRUE;
//		}
//		return Boolean.FALSE;
//	}
//
//	private Boolean seDadosUsuarioECpfDiferentes(UsuarioExterno entidade) {
//		Usuario usuario = obterUsuarioExternoPorLogin(entidade.getTxEmail());
//		String nome = entidade.getNome().trim() + " "
//				+ entidade.getNmSobrenome().trim();
//		CPF cpf = cpfService.obterCPFPorNumeroCPF(entidade.getNrCPF());
//		if (!cpf.getNome().equalsIgnoreCase(nome)) {
//			MensagemUtil.adicionarMensagemErro("msg", "msg00x");
//			return Boolean.TRUE;
//		}
//		return Boolean.FALSE;
//	}
//
//	@Override
//	public void alterar(UsuarioExterno entidade) {
//		if (seJaExisteUsuarioComMesmoEmail(entidade)
//				|| seEmailInvalido(entidade)) {
//			return;
//		}
//		getDao().atualizar(entidade);
//	}
//
//	public void incluir(UsuarioExterno entidade) {
//		entidade.setTipoUsuarioLogin(TipoUsuarioLogin.E);
//		if (seJaExisteUsuarioComMesmoEmail(entidade)
//				|| seEmailInvalido(entidade)) {
//			return;
//		}
//		getDao().incluir(entidade);
//	}
//
//	@Override
//	public UsuarioExternoDAO getDao() {
//		return dao;
//	}
//
//	public UsuarioExterno obterUsuarioExternoPorLogin(String login) {
//		return dao.obterUsuarioExternoPorLogin(login);
//	};
//}
