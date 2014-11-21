package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;
import br.jus.stj.sisouv.entity.schemas.sisouv.embeddable.IdUnidadeInterna;

/**
 * @author francisco.neto
 *
 */
@Entity
@Table(schema = "SISOUV", name = "UNIDADE_INTERNA")
public class UnidadeInterna extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	public UnidadeInterna() {
		id = new IdUnidadeInterna();
	}

	@EmbeddedId
	private IdUnidadeInterna id;

	@MapsId("idLocalRespostaManifestacao")
	@JoinColumn(name = "SQ_LOCAL_RESPOSTA_MANIFESTACAO", referencedColumnName = "SQ_LOCAL_RESPOSTA_MANIFESTACAO")
	@OneToOne
	private LocalRespostaManifestacao localRespostaManifestacao;

	@JoinColumn(name = "SEQ_ID_UNIDADE", referencedColumnName = "seq_id_unidade")
	@ManyToOne
	private UnidOrgnl unidOrgnl;

	/**
	 * @return the id
	 */
	public IdUnidadeInterna getUnidadeInternaId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setUnidadeInternaId(IdUnidadeInterna id) {
		this.id = id;
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
	 * @return the unidOrgnl
	 */
	public UnidOrgnl getUnidOrgnl() {
		return unidOrgnl;
	}

	/**
	 * @param unidOrgnl
	 *            the unidOrgnl to set
	 */
	public void setUnidOrgnl(UnidOrgnl unidOrgnl) {
		this.unidOrgnl = unidOrgnl;
	}

	@Override
	public Long getId() {
		return null;
	}

}