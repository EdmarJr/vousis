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
@Table(schema = "SISOUV", name = "ESCOLARIDADE")
public class Escolaridade extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESCOLARIDADE")
	private Long id; // PK

	@Column(name = "DS_GRAU_ESCOLARIDADE", length = 50)
	private String descricaoGrauEscolaridade;

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
	 * @return the descricaoGrauEscolaridade
	 */
	public String getDescricaoGrauEscolaridade() {
		return descricaoGrauEscolaridade;
	}

	/**
	 * @param descricaoGrauEscolaridade the descricaoGrauEscolaridade to set
	 */
	public void setDescricaoGrauEscolaridade(String descricaoGrauEscolaridade) {
		this.descricaoGrauEscolaridade = descricaoGrauEscolaridade;
	}

}
