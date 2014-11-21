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
public class IdPerfilFuncionalidade implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idFuncionalidade;

	private Long idPerfil;

	/**
	 * @return the idFuncionalidade
	 */
	public Long getIdFuncionalidade() {
		return idFuncionalidade;
	}

	/**
	 * @param idFuncionalidade the idFuncionalidade to set
	 */
	public void setIdFuncionalidade(Long idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}

	/**
	 * @return the idPerfil
	 */
	public Long getIdPerfil() {
		return idPerfil;
	}

	/**
	 * @param idPerfil the idPerfil to set
	 */
	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idFuncionalidade == null) ? 0 : idFuncionalidade.hashCode());
		result = prime * result
				+ ((idPerfil == null) ? 0 : idPerfil.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		IdPerfilFuncionalidade other = (IdPerfilFuncionalidade) obj;
		if (idFuncionalidade == null) {
			if (other.idFuncionalidade != null)
				return false;
		} else if (!idFuncionalidade.equals(other.idFuncionalidade))
			return false;
		if (idPerfil == null) {
			if (other.idPerfil != null)
				return false;
		} else if (!idPerfil.equals(other.idPerfil))
			return false;
		return true;
	}

}