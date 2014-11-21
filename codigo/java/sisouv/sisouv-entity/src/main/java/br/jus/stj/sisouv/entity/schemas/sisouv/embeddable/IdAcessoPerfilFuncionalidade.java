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
public class IdAcessoPerfilFuncionalidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private IdPerfilFuncionalidade idPerfilFuncionalidade;
	
	private Long idTipoAcesso;

	/**
	 * @return the idPerfilFuncionalidade
	 */
	public IdPerfilFuncionalidade getIdPerfilFuncionalidade() {
		return idPerfilFuncionalidade;
	}

	/**
	 * @param idPerfilFuncionalidade
	 *            the idPerfilFuncionalidade to set
	 */
	public void setIdPerfilFuncionalidade(
			IdPerfilFuncionalidade idPerfilFuncionalidade) {
		this.idPerfilFuncionalidade = idPerfilFuncionalidade;
	}

	/**
	 * @return the idTipoAcesso
	 */
	public Long getIdTipoAcesso() {
		return idTipoAcesso;
	}

	/**
	 * @param idTipoAcesso
	 *            the idTipoAcesso to set
	 */
	public void setIdTipoAcesso(Long idTipoAcesso) {
		this.idTipoAcesso = idTipoAcesso;
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
				+ ((idPerfilFuncionalidade == null) ? 0
						: idPerfilFuncionalidade.hashCode());
		result = prime * result
				+ ((idTipoAcesso == null) ? 0 : idTipoAcesso.hashCode());
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
		IdAcessoPerfilFuncionalidade other = (IdAcessoPerfilFuncionalidade) obj;
		if (idPerfilFuncionalidade == null) {
			if (other.idPerfilFuncionalidade != null)
				return false;
		} else if (!idPerfilFuncionalidade.equals(other.idPerfilFuncionalidade))
			return false;
		if (idTipoAcesso == null) {
			if (other.idTipoAcesso != null)
				return false;
		} else if (!idTipoAcesso.equals(other.idTipoAcesso))
			return false;
		return true;
	}

}