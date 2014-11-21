package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;

@Entity
@Table(schema = "SISOUV", name="ANEXO")
public class Anexo extends EntidadeBase {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SQ_ANEXO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAnexo;
	
	@Column(name="NM_ANEXO", length=100)
	private String nomeAnexo;
	
	@Basic
	@Lob
	@Column(name="BL_CONTEUDO")
	private byte[] imagem;
	
	// @ManyToOne
	// @JoinColumn(name = "SQ_MANIFESTACAO_USUARIO", referencedColumnName =
	// "SQ_MANIFESTACAO_USUARIO")
	// private ManifestacaoUsuario manifestacaoUsuario;

	@Override
	public Long getId() {
		return idAnexo;
	}

	/**
	 * @return the idAnexo
	 */
	public Long getIdAnexo() {
		return idAnexo;
	}

	/**
	 * @param idAnexo
	 *            the idAnexo to set
	 */
	public void setIdAnexo(Long idAnexo) {
		this.idAnexo = idAnexo;
	}

	/**
	 * @return the nomeAnexo
	 */
	public String getNomeAnexo() {
		return nomeAnexo;
	}

	/**
	 * @param nomeAnexo
	 *            the nomeAnexo to set
	 */
	public void setNomeAnexo(String nomeAnexo) {
		this.nomeAnexo = nomeAnexo;
	}

	/**
	 * @return the imagem
	 */
	public byte[] getImagem() {
		return imagem;
	}

	/**
	 * @param imagem
	 *            the imagem to set
	 */
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	/**
	 * @return the manifestacaoUsuario
	 */
	// public ManifestacaoUsuario getManifestacaoUsuario() {
	// return manifestacaoUsuario;
	// }
	//
	// /**
	// * @param manifestacaoUsuario
	// * the manifestacaoUsuario to set
	// */
	// public void setManifestacaoUsuario(ManifestacaoUsuario
	// manifestacaoUsuario) {
	// this.manifestacaoUsuario = manifestacaoUsuario;
	// }

}
