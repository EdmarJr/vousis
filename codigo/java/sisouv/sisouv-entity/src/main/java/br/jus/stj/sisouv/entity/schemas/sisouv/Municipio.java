package br.jus.stj.sisouv.entity.schemas.sisouv;
///**
// * 
// */
//package br.jus.stj.sisouv.entity.mssql;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import br.jus.stj.sisouv.entity.EntidadeBase;
//
///**
// * @author zainer.silva
// * 
// */
//@Entity
//@Table(schema = "SISOUV", name = "MUNICIPIO_CORPORATIVA")
//public class Municipio extends EntidadeBase {
//
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "SQ_MUNICIPIO")
//	private Long idMunicipio;
//
//	@ManyToOne
//	@JoinColumn(name = "SG_UF", referencedColumnName = "SG_UF")
//	private UF uf;
//
//	@Column(name = "NM_MUNICIPIO")
//	private String nomeMunicipio;
//
//	/**
//	 * @return the idMunicipio
//	 */
//	public Long getIdMunicipio() {
//		return idMunicipio;
//	}
//
//	/**
//	 * @param idMunicipio
//	 *            the idMunicipio to set
//	 */
//	public void setIdMunicipio(Long idMunicipio) {
//		this.idMunicipio = idMunicipio;
//	}
//
//	/**
//	 * @return the uf
//	 */
//	public UF getUf() {
//		return uf;
//	}
//
//	/**
//	 * @param uf
//	 *            the uf to set
//	 */
//	public void setUf(UF uf) {
//		this.uf = uf;
//	}
//
//	/**
//	 * @return the nomeMunicipio
//	 */
//	public String getNomeMunicipio() {
//		return nomeMunicipio;
//	}
//
//	/**
//	 * @param nomeMunicipio
//	 *            the nomeMunicipio to set
//	 */
//	public void setNomeMunicipio(String nomeMunicipio) {
//		this.nomeMunicipio = nomeMunicipio;
//	}
//
//	@Override
//	public Long getId() {
//		return getIdMunicipio();
//	}
//
//}
