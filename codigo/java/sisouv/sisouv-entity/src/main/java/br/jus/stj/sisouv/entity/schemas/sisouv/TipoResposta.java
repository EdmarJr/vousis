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
@Table(schema = "SISOUV", name = "TIPO_RESPOSTA")
public class TipoResposta extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_RESPOSTA")
	private Long id; // PK

	@Column(name = "DS_TIPO_RESPOSTA", length = 100)
	private String descricaoTipoResposta;

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
	 * @return the descricaoTipoResposta
	 */
	public String getDescricaoTipoResposta() {
		return descricaoTipoResposta;
	}

	/**
	 * @param descricaoTipoResposta the descricaoTipoResposta to set
	 */
	public void setDescricaoTipoResposta(String descricaoTipoResposta) {
		this.descricaoTipoResposta = descricaoTipoResposta;
	}

}
