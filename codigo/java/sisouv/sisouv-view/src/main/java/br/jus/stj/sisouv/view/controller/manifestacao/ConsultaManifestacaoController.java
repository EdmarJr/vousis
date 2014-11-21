package br.jus.stj.sisouv.view.controller.manifestacao;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.jus.stj.sisouv.business.manifestacaousuario.ManifestacaoUsuarioBean;
import br.jus.stj.sisouv.entity.schemas.sisouv.ManifestacaoUsuario;
import br.jus.stj.sisouv.view.controller.GenericController;

@ManagedBean
@ViewScoped
public class ConsultaManifestacaoController extends GenericController {

	private static final long serialVersionUID = 1L;

	private List<ManifestacaoUsuario> listaManifestacaoUsuario;
	private String codigoManifestacao;
	private final static String PAGINA_VISUALIZAR = "/faces/logado/manifestacao/visualizarManifestacao";

	@EJB
	private ManifestacaoUsuarioBean manifestacaoUsuarioBean;
	// @EJB
	// private LoginBean loginBean;
	//
	// @PostConstruct
	// public void init() {
	// listaManifestacaoUsuario = manifestacaoUsuarioBean
	// .obterManifestacaoPorUsuario(loginBean.obterUsuarioLogado());
	//
	// }
	//
	// public void comandoPesquisar(String criterio) {
	// listaManifestacao = manifestacaoBean.pesquisarManifestacao(criterio);
	// }
	//
	// public String comandoVisualizar(Manifestacao manifestacao) {
	// Map<String, Object> requestMap = FacesContext.getCurrentInstance()
	// .getExternalContext().getRequestMap();
	// requestMap.put("idManifestacao", manifestacao.getId());
	// return PAGINA_VISUALIZAR;
	// }

	/**
	 * @return the codigoManifestacao
	 */
	public String getCodigoManifestacao() {
		return codigoManifestacao;
	}

	/**
	 * @param codigoManifestacao
	 *            the codigoManifestacao to set
	 */
	public void setCodigoManifestacao(String codigoManifestacao) {
		this.codigoManifestacao = codigoManifestacao;
	}

	/**
	 * @return the listaManifestacaoUsuario
	 */
	public List<ManifestacaoUsuario> getListaManifestacaoUsuario() {
		return listaManifestacaoUsuario;
	}

	/**
	 * @param listaManifestacaoUsuario
	 *            the listaManifestacaoUsuario to set
	 */
	public void setListaManifestacaoUsuario(
			List<ManifestacaoUsuario> listaManifestacaoUsuario) {
		this.listaManifestacaoUsuario = listaManifestacaoUsuario;
	}

	/**
	 * @return the paginaVisualizar
	 */
	public static String getPaginaVisualizar() {
		return PAGINA_VISUALIZAR;
	}

}