///**
// * 
// */
//package br.jus.stj.sisouv.persistence;
//
//import java.util.List;
//
//import org.hibernate.Criteria;
//import org.hibernate.criterion.Restrictions;
//
//import br.jus.stj.sisouv.entity.schemas.dne.UF;
//
///**
// * @author zainer.silva
// * 
// */
//public class MunicipioDAOImpl extends GenericDAOMssqlImpl<Municipio> implements
//		MunicipioDAO {
//
//	@SuppressWarnings("unchecked")
//	public List<Municipio> recuperarPorUf(UF uf) {
//		Criteria criteria = obterCriteria(Municipio.class);
//		criteria.add(Restrictions.eq("uf", uf));
//		return criteria.list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Municipio> obterPorNomeEUf(String nome, UF uf) {
//		Criteria criteria = obterCriteria(Municipio.class);
//		if (uf != null) {
//			criteria.add(Restrictions.eq("uf", uf));
//		}
//		criteria.add(Restrictions.eq("nomeMunicipio", nome));
//		return criteria.list();
//	}
//
//}
