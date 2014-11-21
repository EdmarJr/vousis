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
 * @author zainer.silva
 * 
 */
@Entity
@Table(schema = "SISOUV", name = "PROFISSAO")
public class Profissao extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SQ_PROFISSAO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfissao;

	@Column(name = "NM_PROFISSAO", length = 100)
	private String nomeProfissao;

	/**
	 * @return the idProfissao
	 */
	public Long getIdProfissao() {
		return idProfissao;
	}

	/**
	 * @param idProfissao
	 *            the idProfissao to set
	 */
	public void setIdProfissao(Long idProfissao) {
		this.idProfissao = idProfissao;
	}

	/**
	 * @return the nomeProfissao
	 */
	public String getNomeProfissao() {
		return nomeProfissao;
	}

	/**
	 * @param nomeProfissao
	 *            the nomeProfissao to set
	 */
	public void setNomeProfissao(String nomeProfissao) {
		this.nomeProfissao = nomeProfissao;
	}

	@Override
	public Long getId() {
		return getIdProfissao();
	}

}
