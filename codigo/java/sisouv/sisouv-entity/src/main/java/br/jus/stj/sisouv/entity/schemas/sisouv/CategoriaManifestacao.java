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
@Table(schema = "SISOUV", name = "CATEGORIA_MANIFESTACAO")
public class CategoriaManifestacao extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CATEGORIA_MANIFESTACAO")
	private Long id;
	
	@Column(name = "NM_MANIFESTACAO", length = 100)
	private String nomeManifestacao;

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
	 * @return the nomeManifestacao
	 */
	public String getNomeManifestacao() {
		return nomeManifestacao;
	}

	/**
	 * @param nomeManifestacao the nomeManifestacao to set
	 */
	public void setNomeManifestacao(String nomeManifestacao) {
		this.nomeManifestacao = nomeManifestacao;
	}

}
