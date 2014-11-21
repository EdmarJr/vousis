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
public class IdUnidadeInterna implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idLocalRespostaManifestacao;

	/**
	 * @return the idLocalRespostaManifestacao
	 */
	public Long getIdLocalRespostaManifestacao() {
		return idLocalRespostaManifestacao;
	}

	/**
	 * @param idLocalRespostaManifestacao
	 *            the idLocalRespostaManifestacao to set
	 */
	public void setIdLocalRespostaManifestacao(Long idLocalRespostaManifestacao) {
		this.idLocalRespostaManifestacao = idLocalRespostaManifestacao;
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
		result = prime
				* result
				+ ((idLocalRespostaManifestacao == null) ? 0
						: idLocalRespostaManifestacao.hashCode());
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
		IdUnidadeInterna other = (IdUnidadeInterna) obj;
		if (idLocalRespostaManifestacao == null) {
			if (other.idLocalRespostaManifestacao != null)
				return false;
		} else if (!idLocalRespostaManifestacao
				.equals(other.idLocalRespostaManifestacao))
			return false;
		return true;
	}

}
