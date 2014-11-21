/**
 * 
 */
package br.jus.stj.sisouv.entity.schemas.sisouv.embeddable;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author francisco.neto
 *
 */
@Embeddable
public class IdUsuarioExternoEndereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idEndereco;

	private Long idUsuarioExterno;

	/**
	 * @return the idEndereco
	 */
	public Long getIdEndereco() {
		return idEndereco;
	}

	/**
	 * @param idEndereco
	 *            the idEndereco to set
	 */
	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	/**
	 * @return the idUsuarioExterno
	 */
	public Long getIdUsuarioExterno() {
		return idUsuarioExterno;
	}

	/**
	 * @param idUsuarioExterno
	 *            the idUsuarioExterno to set
	 */
	public void setIdUsuarioExterno(Long idUsuarioExterno) {
		this.idUsuarioExterno = idUsuarioExterno;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idEndereco == null) ? 0 : idEndereco.hashCode());
		result = prime
				* result
				+ ((idUsuarioExterno == null) ? 0 : idUsuarioExterno.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdUsuarioExternoEndereco other = (IdUsuarioExternoEndereco) obj;
		if (idEndereco == null) {
			if (other.idEndereco != null)
				return false;
		} else if (!idEndereco.equals(other.idEndereco))
			return false;
		if (idUsuarioExterno == null) {
			if (other.idUsuarioExterno != null)
				return false;
		} else if (!idUsuarioExterno.equals(other.idUsuarioExterno))
			return false;
		return true;
	}

}
