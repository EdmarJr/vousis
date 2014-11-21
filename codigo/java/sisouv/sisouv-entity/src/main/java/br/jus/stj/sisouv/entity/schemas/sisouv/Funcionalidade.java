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
@Table(schema = "SISOUV", name = "FUNCIONALIDADE")
public class Funcionalidade extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SQ_FUNCIONALIDADE")
	private Long id; // PK

	@Column(name = "NM_FUNCIONALIDADE", length = 50)
	private String nomeFuncionalidade;

	@Column(name = "DS_FUNCIONALIDADE", length = 100)
	private String descricaoFuncionalidade;

	@Column(name = "ST_ATIVO")
	private char situacao;

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
	 * @return the nomeFuncionalidade
	 */
	public String getNomeFuncionalidade() {
		return nomeFuncionalidade;
	}

	/**
	 * @param nomeFuncionalidade the nomeFuncionalidade to set
	 */
	public void setNomeFuncionalidade(String nomeFuncionalidade) {
		this.nomeFuncionalidade = nomeFuncionalidade;
	}

	/**
	 * @return the descricaoFuncionalidade
	 */
	public String getDescricaoFuncionalidade() {
		return descricaoFuncionalidade;
	}

	/**
	 * @param descricaoFuncionalidade the descricaoFuncionalidade to set
	 */
	public void setDescricaoFuncionalidade(String descricaoFuncionalidade) {
		this.descricaoFuncionalidade = descricaoFuncionalidade;
	}

	/**
	 * @return the situacao
	 */
	public char getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}

}
