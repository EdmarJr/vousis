//package br.jus.stj.sisouv.view.controller.manifestacao;
//
//import java.io.IOException;
//import java.util.logging.Logger;
//
//import javax.annotation.PostConstruct;
//import javax.ejb.EJB;
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
//import javax.faces.event.ActionEvent;
//
//import org.primefaces.event.FlowEvent;
//
//import br.jus.stj.commons.util.MensagemUtil;
//import br.jus.stj.sisouv.business.categoriamanifestacao.CategoriaManifestacaoBean;
//import br.jus.stj.sisouv.business.login.LoginBean;
//import br.jus.stj.sisouv.business.manifestacao.ManifestacaoBean;
//import br.jus.stj.sisouv.business.tiporelacionamento.TipoRelacionamentoBean;
//import br.jus.stj.sisouv.business.tiporesposta.TipoRespostaBean;
//import br.jus.stj.sisouv.business.uf.UFBean;
//import br.jus.stj.sisouv.business.usuarioexterno.UsuarioExternoBean;
//import br.jus.stj.sisouv.business.usuariointerno.UsuarioInternoBean;
//import br.jus.stj.sisouv.entity.enumerators.CategoriaManifestacaoEnum;
//import br.jus.stj.sisouv.entity.schemas.dne.Endereco;
//import br.jus.stj.sisouv.entity.schemas.dne.UF;
//import br.jus.stj.sisouv.entity.schemas.sisouv.Manifestacao;
//import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;
//import br.jus.stj.sisouv.entity.schemas.sisouv.Usuario;
//import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioExterno;
//import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioInterno;
//import br.jus.stj.sisouv.entity.vo.ParametrosDisponiveisInclusaoManifestacaoVO;
//import br.jus.stj.sisouv.view.controller.GenericController;
//import br.jus.stj.sisouv.view.controller.login.LoginController;
//
//@ManagedBean
//@ViewScoped
//public class CadastroManifestacaoController extends GenericController {
//
//	private static final String NOME_TIPO_RESPOSTA_PADRAO = "E-mail";
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -2070763631902434116L;
//	private ParametrosDisponiveisInclusaoManifestacaoVO parametros;
//	private Endereco endereco;
//	private String senhaConfirmada;
//	private Manifestacao manifestacao;
//	private Usuario usuario;
//	@EJB
//	private ManifestacaoBean manifestacaoBean;
//	@EJB
//	private UFBean ufBean;
////	@EJB
////	private MunicipioBean municipioBean;
//	@EJB
//	private TipoRespostaBean tipoRespostaBean;
//	@EJB
//	private TipoRelacionamentoBean tipoRelacionamentoBean;
//	@EJB
//	private CategoriaManifestacaoBean categoriaManifestacaoBean;
//	@EJB
//	private LoginBean loginBean;
//	@EJB
//	private UsuarioExternoBean usuarioExternoBean;
//	@EJB
//	private UsuarioInternoBean usuarioInternoBean;
//	@ManagedProperty("#{loginController}")
//	private LoginController loginController;
//	/**
//	 * Dentro dessa classe é aonde fica todos os métodos e atributos referentes
//	 * aos possiveis comportamentos que a tela de cadastro pode ter. Na maioria
//	 * dos casos métodos ou atributos necessários para uma mudança de
//	 * comportamento utilizando requisições ajax.
//	 */
//	private CadastroManifestacaoBehaviorController behavior;
//
//	private Boolean usuarioExterno;
//
//	private Usuario usuarioLogado;
//
//	@PostConstruct
//	public void init() {
//		setBehavior(new CadastroManifestacaoBehaviorController(this));
//
//		setParametros(manifestacaoBean
//				.obterParametrosDisponiveisInclusaoManifestacao());
//
//		setUsuarioLogado(loginBean.obterUsuarioLogado());
//		setUsuario(getUsuarioLogado() != null ? getUsuarioLogado()
//				: new UsuarioExterno());
//		setManifestacao(new Manifestacao());
//		getManifestacao().setUsuarioManifestacao(new ManifestacaoUsuario());
//		definirTipoRespostaPadrao();
//		definirSeEUsuarioExterno();
//
//		setEndereco(obterEnderecoDoUsuarioLogado());
//
//		getBehavior().definirComportamentoDoComboTipoRelacionamento();
//		getBehavior().definirComportamentoDoBotaoAtualizar();
//		getBehavior().definirComportamentoDoComboMunicipio();
//
//	}
//
//	public void carregarComboMunicipios(UF uf) {
////		parametros.setListaMunicipio(municipioBean.obterPorUf(uf));
//	}
//
//	private Endereco obterEnderecoDoUsuarioLogado() {
////		Endereco endereco = new Endereco();
////		endereco.setMunicipio(new Municipio());
////		if (seExisteUmUsuarioLogadoSendoDoTipoUsuarioInterno()) {
////			UsuarioInterno usuario = ((UsuarioInterno) usuarioLogado);
////			endereco.setMunicipio(municipioBean
////					.obterMunicipioPorUsuarioInterno(usuario));
////			endereco.setLogradouro(usuario.getLoginStj().getServidor()
////					.getEndereco()
////					+ " "
////					+ usuario.getLoginStj().getServidor().getComplemento()
////					+ " " + usuario.getLoginStj().getServidor().getBairro());
////			endereco.setCep(usuario.getLoginStj().getServidor().getCEP());
////		} else if (seExisteUmUsuarioLogadoSendoDoTipoUsuarioExterno()) {
////			UsuarioExterno usuarioExterno = ((UsuarioExterno) usuarioLogado);
////			endereco = usuarioExterno.getEndereco();
////		}
//		return null;
//	}
//
//	public Boolean seExisteUmUsuarioLogadoSendoDoTipoUsuarioExterno() {
//		return getUsuarioLogado() != null && getUsuarioExterno();
//	}
//
//	public Boolean seExisteUmUsuarioLogadoSendoDoTipoUsuarioInterno() {
//		return usuarioLogado != null && !usuarioExterno;
//	}
//
//	private void definirTipoRespostaPadrao() {
//		getManifestacao().getManifestacaoUsuario().setTipoResposta(
//				tipoRespostaBean.obterPorNome(NOME_TIPO_RESPOSTA_PADRAO));
//	}
//
//	/**
//	 * Método responsável por definir qual será o comportamento do controller
//	 * 
//	 * @author edmar.junior
//	 */
//	public void definirSeEUsuarioExterno() {
//		if (usuarioLogado != null && !(usuarioLogado instanceof UsuarioExterno)) {
//			setUsuarioExterno(Boolean.FALSE);
//			return;
//		}
//		setUsuarioExterno(Boolean.TRUE);
//	}
//
//	/**
//	 * 
//	 * Método responsável por definir qual será a categoria da manifestação a
//	 * ser incluída,de acordo com o parametro 'categoriaManifestacao' recebido
//	 * via requisicao "GET". Este método é automaticamente chamado da tela antes
//	 * de seus componentes serem carregados.
//	 * 
//	 * @author edmar.junior
//	 */
//	public void definirCategoriaManifestacao(String nome) {
//		if (nome != null
//				&& nome.equals(CategoriaManifestacaoEnum.LAI.getDescricao())) {
////			manifestacao
////					.setCategoriaManifestacao(categoriaManifestacaoBean
////							.obterPorNome(CategoriaManifestacaoEnum.LAI
////									.getDescricao()));
//			return;
//		}
//
////		manifestacao.setCategoriaManifestacao(categoriaManifestacaoBean
////				.obterPorNome(CategoriaManifestacaoEnum.OUVIDORIA
////						.getDescricao()));
//
//	}
//
//	public Boolean seSenhaDoUsuarioIgualSenhaConfirmacao(UsuarioExterno usuario) {
//		if (!usuario.getSenha().equals(senhaConfirmada)) {
//			MensagemUtil.adicionarMensagemErro("senha", "msg",
//					"senha.invalida.mensagem");
//			return Boolean.FALSE;
//		}
//		return Boolean.TRUE;
//	}
//
//	public void comandoCadastrar() {
//		UsuarioExterno usuario2 = (UsuarioExterno) usuario;
//		if (seSenhaDoUsuarioIgualSenhaConfirmacao(usuario2)) {
//			usuario2.setEndereco(endereco);
////			usuario2.getEndereco().setUsuarioExterno(usuario2);
//			usuarioExternoBean.incluir(usuario2);
//			if (FacesContext.getCurrentInstance().getMessageList().size() == 0) {
//				setUsuarioLogado(usuarioExternoBean
//						.obterUsuarioExternoPorLogin(usuario2.getTxEmail()));
//			}
//		}
//	}
//
//	public void comandoAtualizar() {
//		if (usuarioLogado instanceof UsuarioExterno) {
//			UsuarioExterno usuario2 = (UsuarioExterno) usuarioLogado;
//			usuario2.setEndereco(endereco);
//			usuarioExternoBean.alterar(usuario2);
//			loginController.logOut();
//			try {
//				FacesContext.getCurrentInstance().getExternalContext()
//						.redirect("../logado/manifestacao/manifestacao.jsf");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} else {
//			UsuarioInterno usuario = (UsuarioInterno) usuarioLogado;
//			usuarioInternoBean.alterar(usuario);
//		}
//	}
//
//	public void comandoIncluir() {
//		if (usuarioLogado == null) {
//			comandoCadastrar();
//		}
//		manifestacao.getManifestacaoUsuario().setUsuario(usuarioLogado);
//		manifestacaoBean.incluirManifestacao(manifestacao);
//		abrirModal("dialogShowIdManifestacao");
//	}
//
//	private boolean skip;
//
//	private static Logger logger = Logger
//			.getLogger(CadastroManifestacaoController.class.getName());
//
//	public void save(ActionEvent actionEvent) {
//
//		FacesMessage msg = new FacesMessage("Successful", "Welcome :");
//		FacesContext.getCurrentInstance().addMessage(null, msg);
//	}
//
//	public boolean isSkip() {
//		return skip;
//	}
//
//	public void setSkip(boolean skip) {
//		this.skip = skip;
//	}
//
//	public String onFlowProcess(FlowEvent event) {
//	logger.info("Current wizard step:" + event.getOldStep());
//	logger.info("Next step:" + event.getNewStep());
//
//			return event.getNewStep();
//		
//	}
//
//	public String getSenhaConfirmada() {
//		return senhaConfirmada;
//	}
//
//	public void setSenhaConfirmada(String senhaConfirmada) {
//		this.senhaConfirmada = senhaConfirmada;
//	}
//
//	/**
//	 * @return the manifestacao
//	 */
//	public Manifestacao getManifestacao() {
//		return manifestacao;
//	}
//
//	/**
//	 * @param manifestacao
//	 *            the manifestacao to set
//	 */
//	public void setManifestacao(Manifestacao manifestacao) {
//		this.manifestacao = manifestacao;
//	}
//
//	/**
//	 * @return the usuario
//	 */
//
//	public Usuario getUsuarioLogado() {
//		return usuarioLogado;
//	}
//
//	public TipoRelacionamentoBean getTipoRelacionamentoBean() {
//		return tipoRelacionamentoBean;
//	}
//
//	public void setUsuarioLogado(Usuario usuarioLogado) {
//		this.usuarioLogado = usuarioLogado;
//	}
//
//	/**
//	 * @param usuario
//	 *            the usuario to set
//	 */
//
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}
//
//	public Endereco getEndereco() {
//		return endereco;
//	}
//
//	public Usuario getUsuario() {
//		return usuario;
//	}
//
//	public void setUsuario(Usuario usuario) {
//		this.usuario = usuario;
//	}
//
//	public Boolean getUsuarioExterno() {
//		return usuarioExterno;
//	}
//
//	public void setUsuarioExterno(Boolean usuarioExterno) {
//		this.usuarioExterno = usuarioExterno;
//	}
//
//	public ParametrosDisponiveisInclusaoManifestacaoVO getParametros() {
//		return parametros;
//	}
//
//	public void setParametros(
//			ParametrosDisponiveisInclusaoManifestacaoVO parametros) {
//		this.parametros = parametros;
//	}
//
//	public CadastroManifestacaoBehaviorController getBehavior() {
//		return behavior;
//	}
//
//	public void setBehavior(CadastroManifestacaoBehaviorController behavior) {
//		this.behavior = behavior;
//	}
//
//	public UFBean getUfBean() {
//		return ufBean;
//	}
//
////	public MunicipioBean getMunicipioBean() {
////		return municipioBean;
////	}
//
//	public void setLoginController(LoginController loginController) {
//		this.loginController = loginController;
//	}
//
//}