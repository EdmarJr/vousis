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
import br.jus.stj.sisouv.entity.schemas.sisouv.embeddable.IdControleAcesso;

/**
 * @author francisco.neto
 *
 */
@Entity
@Table(schema = "SISOUV", name = "CONTROLE_ACESSO")
public class ControleAcesso extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	public ControleAcesso() {
		id = new IdControleAcesso();
	}

	@EmbeddedId
	private IdControleAcesso id;

	@ManyToOne
	@JoinColumn(name = "SQ_PERFIL", referencedColumnName = "SQ_PERFIL")
	@MapsId("idPerfil")
	private Perfil perfil;

	@MapsId("idUsuario")
	@ManyToOne
	@JoinColumn(name = "SQ_USUARIO", referencedColumnName = "SQ_USUARIO")
	private Usuario usuario;

	@Override
	public Long getId() {
		return null;
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
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(IdControleAcesso id) {
		this.id = id;
	}

}
