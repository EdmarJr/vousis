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
@Table(schema = "SISOUV", name = "PERFIL")
public class Perfil extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SQ_PERFIL")
	private Long id;
	
	@Column(name = "NM_PERFIL", length = 50)
	private String nomePerfil;
	
	@Column(name = "SG_PERFIL", length = 6)
	private String siglaPerfil;

	@Column(name = "DS_PERFIL", length = 100)
	private String descricaoPerfil;
	
	@Column(name = "ST_ATIVO")
	private char situacao;
	
	@Column(name = "ST_EDITAVEL")
	private char editavel;

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
	 * @return the nomePerfil
	 */
	public String getNomePerfil() {
		return nomePerfil;
	}

	/**
	 * @param nomePerfil the nomePerfil to set
	 */
	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}

	/**
	 * @return the siglaPerfil
	 */
	public String getSiglaPerfil() {
		return siglaPerfil;
	}

	/**
	 * @param siglaPerfil the siglaPerfil to set
	 */
	public void setSiglaPerfil(String siglaPerfil) {
		this.siglaPerfil = siglaPerfil;
	}

	/**
	 * @return the descricaoPerfil
	 */
	public String getDescricaoPerfil() {
		return descricaoPerfil;
	}

	/**
	 * @param descricaoPerfil the descricaoPerfil to set
	 */
	public void setDescricaoPerfil(String descricaoPerfil) {
		this.descricaoPerfil = descricaoPerfil;
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

	/**
	 * @return the editavel
	 */
	public char getEditavel() {
		return editavel;
	}

	/**
	 * @param editavel the editavel to set
	 */
	public void setEditavel(char editavel) {
		this.editavel = editavel;
	}
	
}
