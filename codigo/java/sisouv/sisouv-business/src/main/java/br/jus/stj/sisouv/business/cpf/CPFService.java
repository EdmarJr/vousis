package br.jus.stj.sisouv.business.cpf;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.gov.cjf.webservice.CPF;
import br.gov.cjf.webservice.WsConsultaCPF_Service;

@Stateless
@LocalBean
public class CPFService {
	public CPF obterCPFPorNumeroCPF(String nCPF) {
		WsConsultaCPF_Service service = new WsConsultaCPF_Service();
		CPF cpf = service.getWsConsultaCPFSoapHttpPort().getObjetcCPFSecurity(
				nCPF, "STJ", "STJ", "SISOUV");
		return cpf;
	}
}
