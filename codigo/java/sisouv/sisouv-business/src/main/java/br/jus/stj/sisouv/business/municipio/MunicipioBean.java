//package br.jus.stj.sisouv.business.municipio;
//
//import java.util.List;
//
//import javax.ejb.EJB;
//import javax.ejb.LocalBean;
//import javax.ejb.Stateless;
//import javax.inject.Inject;
//
//import br.jus.stj.sisouv.business.Bean;
//import br.jus.stj.sisouv.business.uf.UFBean;
//import br.jus.stj.sisouv.entity.schemas.dne.UF;
//import br.jus.stj.sisouv.entity.schemas.sisouv.UsuarioInterno;
//import br.jus.stj.sisouv.persistence.MunicipioDAO;
//
//@Stateless
//@LocalBean
//public class MunicipioBean extends Bean<Municipio> {
//
//	@Inject
//	private MunicipioDAO municipioDAO;
//	@EJB
//	private UFBean ufBean;
//
//
//	public List<Municipio> obterPorNomeEUf(String nome, UF uf) {
//		return municipioDAO.obterPorNomeEUf(nome, uf);
//	}
//
//	public Municipio obterMunicipioPorUsuarioInterno(UsuarioInterno usuario) {
//		UF uf = ufBean.obterUfDeUmUsuarioInterno(usuario);
//		List<Municipio> municipios = obterPorNomeEUf(usuario.getLoginStj()
//				.getServidor().getCidade(), uf);
//		return municipios.size() > 0 ? municipios.get(0) : null;
//	}
//
//	public List<Municipio> obterPorUf(UF uf) {
//		return municipioDAO.recuperarPorUf(uf);
//
//	}
//
//	@Override
//	public MunicipioDAO getDao() {
//		return municipioDAO;
//	}
//
//}
