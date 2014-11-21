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
import br.jus.stj.sisouv.entity.schemas.sisouv.embeddable.IdUsuarioExternoEndereco;

/**
 * @author francisco.neto
 *
 */
@Entity
@Table(schema = "SISOUV", name = "USUARIO_EXTERNO_ENDERECO")
public class UsuarioExternoEndereco extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	public UsuarioExternoEndereco() {
		idUsuarioExternoEndereco = new IdUsuarioExternoEndereco();
	}

	@EmbeddedId
	private IdUsuarioExternoEndereco idUsuarioExternoEndereco;

	@MapsId("idEndereco")
	@JoinColumn(name = "SQ_ENDERECO", referencedColumnName = "SQ_ENDERECO")
	@ManyToOne
	private Endereco endereco;

	@MapsId("idUsuarioExterno")
	@JoinColumn(name = "SQ_USUARIO_EXTERNO", referencedColumnName = "SQ_USUARIO_EXTERNO")
	@ManyToOne
	private UsuarioExterno usuarioExterno;

	@Override
	public Long getId() {
		return null;
	}

	/**
	 * @return the idUsuarioExternoEndereco
	 */
	public IdUsuarioExternoEndereco getIdUsuarioExternoEndereco() {
		return idUsuarioExternoEndereco;
	}

	/**
	 * @param idUsuarioExternoEndereco
	 *            the idUsuarioExternoEndereco to set
	 */
	public void setIdUsuarioExternoEndereco(
			IdUsuarioExternoEndereco idUsuarioExternoEndereco) {
		this.idUsuarioExternoEndereco = idUsuarioExternoEndereco;
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the usuarioExterno
	 */
	public UsuarioExterno getUsuarioExterno() {
		return usuarioExterno;
	}

	/**
	 * @param usuarioExterno
	 *            the usuarioExterno to set
	 */
	public void setUsuarioExterno(UsuarioExterno usuarioExterno) {
		this.usuarioExterno = usuarioExterno;
	}

}
