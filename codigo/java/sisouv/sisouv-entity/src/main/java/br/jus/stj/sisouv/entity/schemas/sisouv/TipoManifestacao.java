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
@Table(schema = "SISOUV", name = "TIPO_MANIFESTACAO")
public class TipoManifestacao extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_MANIFESTACAO")
	private Long id;
	
	@Column(name = "DS_TIPO_MANIFESTACAO", length = 50)
	private String descricaoTipoManifestacao;
	
	@Column(name = "QT_PRAZO", length = 2)
	private Long quantidadePrazo;

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
	 * @return the descricaoTipoManifestacao
	 */
	public String getDescricaoTipoManifestacao() {
		return descricaoTipoManifestacao;
	}

	/**
	 * @param descricaoTipoManifestacao the descricaoTipoManifestacao to set
	 */
	public void setDescricaoTipoManifestacao(String descricaoTipoManifestacao) {
		this.descricaoTipoManifestacao = descricaoTipoManifestacao;
	}

	/**
	 * @return the quantidadePrazo
	 */
	public Long getQuantidadePrazo() {
		return quantidadePrazo;
	}

	/**
	 * @param quantidadePrazo the quantidadePrazo to set
	 */
	public void setQuantidadePrazo(Long quantidadePrazo) {
		this.quantidadePrazo = quantidadePrazo;
	}

}
