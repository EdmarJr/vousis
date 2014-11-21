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
@Table(schema = "SISOUV", name = "LOCAL_RESPOSTA_MANIFESTACAO")
public class LocalRespostaManifestacao extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SQ_LOCAL_RESPOSTA_MANIFESTACAO")
	private Long idLocalRespostaManifestacao;
	
	@Column(name = "TP_LOCAL_RESPOSTA")
	private char tipoLocalResposta;
	
	@Column(name = "DS_OBSERVACAO_RESPOSTA", length = 300)
	private String descricaoObservacaoResposta;
	
	@Column(name = "NM_EMAIL", length = 150)
	private String nomeEmail;

	/**
	 * @return the id
	 */
	public Long getId() {
		return idLocalRespostaManifestacao;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.idLocalRespostaManifestacao = id;
	}

	/**
	 * @return the tipoLocalResposta
	 */
	public char getTipoLocalResposta() {
		return tipoLocalResposta;
	}

	/**
	 * @param tipoLocalResposta the tipoLocalResposta to set
	 */
	public void setTipoLocalResposta(char tipoLocalResposta) {
		this.tipoLocalResposta = tipoLocalResposta;
	}

	/**
	 * @return the descricaoObservacaoResposta
	 */
	public String getDescricaoObservacaoResposta() {
		return descricaoObservacaoResposta;
	}

	/**
	 * @param descricaoObservacaoResposta the descricaoObservacaoResposta to set
	 */
	public void setDescricaoObservacaoResposta(String descricaoObservacaoResposta) {
		this.descricaoObservacaoResposta = descricaoObservacaoResposta;
	}

	/**
	 * @return the nomeEmail
	 */
	public String getNomeEmail() {
		return nomeEmail;
	}

	/**
	 * @param nomeEmail the nomeEmail to set
	 */
	public void setNomeEmail(String nomeEmail) {
		this.nomeEmail = nomeEmail;
	}

}
