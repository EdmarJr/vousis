/**
 * 
 */
package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;
import br.jus.stj.sisouv.entity.schemas.sisouv.embeddable.IdPerfilFuncionalidade;

/**
 * @author francisco.neto
 * 
 */
@Table(schema = "SISOUV", name = "PERFIL_FUNCIONALIDADE")
@Entity
public class PerfilFuncionalidade extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	public PerfilFuncionalidade() {
		id = new IdPerfilFuncionalidade();
	}

	@EmbeddedId
	private IdPerfilFuncionalidade id;

	@MapsId("idFuncionalidade")
	@ManyToOne
	@JoinColumn(name = "SQ_FUNCIONALIDADE", referencedColumnName = "SQ_FUNCIONALIDADE")
	private Funcionalidade funcionalidade;

	@MapsId("idPerfil")
	@ManyToOne
	@JoinColumn(name = "SQ_PERFIL", referencedColumnName = "SQ_PERFIL")
	private Perfil perfil;

	@Override
	public Long getId() {
		return null;
	}

	/**
	 * @return the funcionalidade
	 */
	public Funcionalidade getFuncionalidade() {
		return funcionalidade;
	}

	/**
	 * @param funcionalidade
	 *            the funcionalidade to set
	 */
	public void setFuncionalidade(Funcionalidade funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	/**
	 * @return the perfil
	 */
	public Perfil getPerfil() {
		return perfil;
	}

	/**
	 * @param perfil
	 *            the perfil to set
	 */
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(IdPerfilFuncionalidade id) {
		this.id = id;
	}

}