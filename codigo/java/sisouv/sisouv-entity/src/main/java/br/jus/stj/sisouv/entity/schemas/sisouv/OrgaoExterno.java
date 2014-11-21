/**
 * 
 */
package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;
import br.jus.stj.sisouv.entity.schemas.sisouv.embeddable.IdOrgaoExterno;

/**
 * @author francisco.neto
 *
 */
@Entity
@Table(schema = "SISOUV", name = "ORGAO_EXTERNO")
public class OrgaoExterno extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IdOrgaoExterno idOrgaoExterno;

	@MapsId("idLocalRespostaManifestacao")
	@JoinColumn(name = "SQ_LOCAL_RESPOSTA_MANIFESTACAO", referencedColumnName = "SQ_LOCAL_RESPOSTA_MANIFESTACAO")
	@OneToOne
	private LocalRespostaManifestacao localRespostaManifestacao;

	@JoinColumn(name = "SQ_ENDERECO", referencedColumnName = "SQ_ENDERECO")
	@ManyToOne
	private Endereco endereco;

	@Column(name = "NM_ORGAO_EXTERNO", length = 100)
	private String nomeOrgaoExterno;

	@Column(name = "SG_ORGAO_EXTERNO", length = 6)
	private String siglaOrgaoExterno;

	@Column(name = "NM_RESPONSAVEL_ORGAO_EXTERNO", length = 100)
	private String nomeResponsavelOrgaoExterno;

	@Override
	public Long getId() {
		return null;
	}

	/**
	 * @return the idOrgaoExterno
	 */
	public IdOrgaoExterno getIdOrgaoExterno() {
		return idOrgaoExterno;
	}

	/**
	 * @param idOrgaoExterno
	 *            the idOrgaoExterno to set
	 */
	public void setIdOrgaoExterno(IdOrgaoExterno idOrgaoExterno) {
		this.idOrgaoExterno = idOrgaoExterno;
	}

	/**
	 * @return the localRespostaManifestacao
	 */
	public LocalRespostaManifestacao getLocalRespostaManifestacao() {
		return localRespostaManifestacao;
	}

	/**
	 * @param localRespostaManifestacao
	 *            the localRespostaManifestacao to set
	 */
	public void setLocalRespostaManifestacao(
			LocalRespostaManifestacao localRespostaManifestacao) {
		this.localRespostaManifestacao = localRespostaManifestacao;
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
	 * @return the nomeOrgaoExterno
	 */
	public String getNomeOrgaoExterno() {
		return nomeOrgaoExterno;
	}

	/**
	 * @param nomeOrgaoExterno
	 *            the nomeOrgaoExterno to set
	 */
	public void setNomeOrgaoExterno(String nomeOrgaoExterno) {
		this.nomeOrgaoExterno = nomeOrgaoExterno;
	}

	/**
	 * @return the siglaOrgaoExterno
	 */
	public String getSiglaOrgaoExterno() {
		return siglaOrgaoExterno;
	}

	/**
	 * @param siglaOrgaoExterno
	 *            the siglaOrgaoExterno to set
	 */
	public void setSiglaOrgaoExterno(String siglaOrgaoExterno) {
		this.siglaOrgaoExterno = siglaOrgaoExterno;
	}

	/**
	 * @return the nomeResponsavelOrgaoExterno
	 */
	public String getNomeResponsavelOrgaoExterno() {
		return nomeResponsavelOrgaoExterno;
	}

	/**
	 * @param nomeResponsavelOrgaoExterno
	 *            the nomeResponsavelOrgaoExterno to set
	 */
	public void setNomeResponsavelOrgaoExterno(
			String nomeResponsavelOrgaoExterno) {
		this.nomeResponsavelOrgaoExterno = nomeResponsavelOrgaoExterno;
	}

}
