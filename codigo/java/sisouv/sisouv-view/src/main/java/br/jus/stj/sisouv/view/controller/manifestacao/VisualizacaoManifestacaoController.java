//package br.jus.stj.sisouv.view.controller.manifestacao;
//
//import java.util.Map;
//
//import javax.annotation.PostConstruct;
//import javax.ejb.EJB;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
//
//import br.jus.stj.sisouv.business.manifestacao.ManifestacaoBean;
//import br.jus.stj.sisouv.entity.schemas.sisouv.Manifestacao;
//import br.jus.stj.sisouv.view.controller.GenericController;
//
//@ManagedBean
//@ViewScoped
//public class VisualizacaoManifestacaoController extends GenericController {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private Manifestacao manifestacao;
//	@EJB
//	private ManifestacaoBean bean;
//
//	@PostConstruct
//	private void initialize() {
//		Map<String, Object> requestMap = FacesContext.getCurrentInstance()
//				.getExternalContext().getRequestMap();
//		if (requestMap.get("idManifestacao") != null) {
//			Long idManifestacao = (Long) requestMap.get("idManifestacao");
//			manifestacao = bean.obterPorId(idManifestacao);
//		}
//	}
//
//	public Manifestacao getManifestacao() {
//		return manifestacao;
//	}
//
//	public void setManifestacao(Manifestacao manifestacao) {
//		this.manifestacao = manifestacao;
//	}
//
//}
