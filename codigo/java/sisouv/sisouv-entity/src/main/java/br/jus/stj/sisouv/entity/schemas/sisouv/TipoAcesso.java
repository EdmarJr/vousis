/**
 * 
 */
package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;

/**
 * @author francisco.neto
 *
 */
@Entity
@Table(schema = "SISOUV", name = "TIPO_ACESSO")
public class TipoAcesso extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SQ_TIPO_ACESSO")
	private Long id; // PK
	
	@Column(name = "NM_TIPO_ACESSO", length = 50)
	private String nomeTipoAcesso;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nomeTipoAcesso
	 */
	public String getNomeTipoAcesso() {
		return nomeTipoAcesso;
	}

	/**
	 * @param nomeTipoAcesso the nomeTipoAcesso to set
	 */
	public void setNomeTipoAcesso(String nomeTipoAcesso) {
		this.nomeTipoAcesso = nomeTipoAcesso;
	}

}
