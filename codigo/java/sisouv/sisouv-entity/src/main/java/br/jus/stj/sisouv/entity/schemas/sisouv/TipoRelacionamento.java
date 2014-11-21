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
@Table(schema = "SISOUV", name = "TIPO_RELACIONAMENTO")
public class TipoRelacionamento extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_RELACIONAMENTO")
	private Long id;

	@Column(name = "DS_TIPO_RELACIONAMENTO", length = 100)
	private String descricaoTipoRelacionamento;

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
	 * @return the descricaoTipoRelacionamento
	 */
	public String getDescricaoTipoRelacionamento() {
		return descricaoTipoRelacionamento;
	}

	/**
	 * @param descricaoTipoRelacionamento the descricaoTipoRelacionamento to set
	 */
	public void setDescricaoTipoRelacionamento(String descricaoTipoRelacionamento) {
		this.descricaoTipoRelacionamento = descricaoTipoRelacionamento;
	}

}
