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
@Table(schema = "dbo", name = "unid_orgnl")
public class UnidOrgnl extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seq_id_unidade")
	private Long id;

	@Override
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

}
