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
@Table(schema = "SISOUV", name = "PRONOME_TRATAMENTO")
public class PronomeTratamento extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRONOME_TRATAMENTO")
	private Long id;

	@Column(name = "DS_PRONOME", length = 20)
	private String descricaoPronome;

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
	 * @return the descricaoPronome
	 */
	public String getDescricaoPronome() {
		return descricaoPronome;
	}

	/**
	 * @param descricaoPronome the descricaoPronome to set
	 */
	public void setDescricaoPronome(String descricaoPronome) {
		this.descricaoPronome = descricaoPronome;
	}

}
