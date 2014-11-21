//package br.jus.stj.sisouv.view.controller.manifestacao;
//
//import java.util.Map;
//
//import javax.faces.context.FacesContext;
//
//import org.primefaces.context.RequestContext;
//
//import br.jus.stj.commons.util.MensagemUtil;
//import br.jus.stj.sisouv.entity.schemas.dne.Endereco;
//import br.jus.stj.sisouv.entity.schemas.dne.UF;
//
//public class CadastroManifestacaoBehaviorController {
//	private CadastroManifestacaoController controller;
//	private Boolean ufMunicipioDesabilitados;
//	private Boolean enderecoObrigatorio;
//	private Boolean botaoAtualizarVisivel;
//	private Boolean comboMunicipioDesabilitado;
//
//	public CadastroManifestacaoBehaviorController(
//			CadastroManifestacaoController controller) {
//		this.controller = controller;
//		setUfMunicipioDesabilitados(Boolean.FALSE);
//		setEnderecoObrigatorio(Boolean.FALSE);
//
//	}
//
//	public void definirEnderecoComParametrosNoRequest() {
//		if (controller.getEndereco() == null) {
//			controller.setEndereco(new Endereco());
//		}
//		Map<String, String> map = FacesContext.getCurrentInstance()
//				.getExternalContext().getRequestParameterMap();
//		UF uf = controller.getUfBean()
//				.obterPorNome(map.get("endereco.estado").trim()).get(0);
////		controller.getParametros().setListaMunicipio(
////				controller.getMunicipioBean().obterPorUf(uf));
////		controller
////				.getEndereco()
////				.setMunicipio(
////						controller
////								.getMunicipioBean()
////								.obterPorNomeEUf(map.get("endereco.cidade"), uf)
////								.get(0));
////		controller.getEndereco().setLogradouro(map.get("endereco.logradouro"));
////		setUfMunicipioDesabilitados(Boolean.TRUE);
//	}
//
//	public void definirComportamentoDoComboTipoRelacionamento() {
//		if (controller.seExisteUmUsuarioLogadoSendoDoTipoUsuarioInterno()) {
////			controller
////					.getManifestacao()
////					.getManifestacaoUsuario()
////					.setTipoRelacionamento(
////							controller.getTipoRelacionamentoBean()
////									.obterPorNome("Servidor do STJ"));
//		}
//	}
//
//	public void definirComportamentoDoComboMunicipio() {
////		UF uf = controller.getEndereco().getMunicipio().getUf();
////		if (uf != null) {
////			controller.carregarComboMunicipios(uf);
////			setComboMunicipioDesabilitado(Boolean.FALSE);
////			return;
////		}
////		setComboMunicipioDesabilitado(Boolean.TRUE);
//	}
//
//	public void definirComportamentoDoBotaoAtualizar() {
//		setBotaoAtualizarVisivel(controller.getUsuarioLogado() != null ? Boolean.TRUE
//				: Boolean.FALSE);
//	}
//
//	public void adicionarMensagemErroCepInvalido() {
//		MensagemUtil.adicionarMensagemErro("nrCEP", "msg", "msg008");
//		RequestContext.getCurrentInstance().execute("$('.cep').val('');");
//	}
//
//	public void onChangeTipoResposta() {
//		if (controller.getManifestacao().getManifestacaoUsuario()
//				.getTipoResposta().getDescricaoTipoResposta()
//				.equalsIgnoreCase("Carta")) {
//			enderecoObrigatorio = Boolean.TRUE;
//		} else {
//			enderecoObrigatorio = Boolean.FALSE;
//		}
//	}
//
//	public Boolean getUfMunicipioDesabilitados() {
//		return ufMunicipioDesabilitados;
//	}
//
//	public void setUfMunicipioDesabilitados(Boolean ufMunicipioDesabilitados) {
//		this.ufMunicipioDesabilitados = ufMunicipioDesabilitados;
//	}
//
//	public Boolean getEnderecoObrigatorio() {
//		return enderecoObrigatorio;
//	}
//
//	public void setEnderecoObrigatorio(Boolean enderecoObrigatorio) {
//		this.enderecoObrigatorio = enderecoObrigatorio;
//	}
//
//	public Boolean getBotaoAtualizarVisivel() {
//		return botaoAtualizarVisivel;
//	}
//
//	public void setBotaoAtualizarVisivel(Boolean botaoAtualizarVisivel) {
//		this.botaoAtualizarVisivel = botaoAtualizarVisivel;
//	}
//
//	public Boolean getComboMunicipioDesabilitado() {
//		return comboMunicipioDesabilitado;
//	}
//
//	public void setComboMunicipioDesabilitado(Boolean comboMunicipioDesabilitado) {
//		this.comboMunicipioDesabilitado = comboMunicipioDesabilitado;
//	}
//}