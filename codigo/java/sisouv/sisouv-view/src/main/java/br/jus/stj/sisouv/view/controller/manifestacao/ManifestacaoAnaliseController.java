//package br.jus.stj.sisouv.view.controller.manifestacao;
//
//import java.util.logging.Logger;
//
//import javax.ejb.EJB;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//
//import org.primefaces.event.FlowEvent;
//
//import br.jus.stj.sisouv.business.manifestacao.ManifestacaoBean;
//import br.jus.stj.sisouv.entity.mssql.sisouv.Manifestacao;
//import br.jus.stj.sisouv.view.controller.GenericController;
//
//@ManagedBean
//@RequestScoped
//public class ManifestacaoAnaliseController extends GenericController {
//
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	private boolean skip;
//	
//	private Manifestacao manifestacao;
//	
//	@EJB
//	private ManifestacaoBean bean;
//	
//	private static Logger logger = Logger
//			.getLogger(ManifestacaoAnaliseController.class.getName());
//	
//	
//	
//	
//	public String onFlowProcess(FlowEvent event){
//		logger.info("Current wizard step"+ event.getNewStep());
//		logger.info("next"+event.getNewStep());
//		if(skip) {
//            skip = false;   
//            return "confirm";
//        }
//        else {
//            return event.getNewStep();
//        }
//		
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
//	public Manifestacao getManifestacao() {
//		return manifestacao;
//	}
//
//	public void setManifestacao(Manifestacao manifestacao) {
//		this.manifestacao = manifestacao;
//	}
//
//	public ManifestacaoBean getBean() {
//		return bean;
//	}
//
//	public void setBean(ManifestacaoBean bean) {
//		this.bean = bean;
//	}
//	
//}
