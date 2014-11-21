package br.jus.stj.sisouv.entity.schemas.sisouv;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.jus.stj.sisouv.entity.EntidadeBase;
import br.jus.stj.sisouv.entity.schemas.dne.EnderecoDNE;
import br.jus.stj.sisouv.entity.schemas.dne.UF;

@Entity
@Table(schema = "SISOUV", name = "MANIFESTACAO_USUARIO")
public class ManifestacaoUsuario extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SQ_MANIFESTACAO_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idManifestacaoUsuario;

	@ManyToOne
	@JoinColumn(name="ID_TIPO_MANIFESTACAO", referencedColumnName="ID_TIPO_MANIFESTACAO")
	private TipoManifestacao tipoManifestacao;

	@OneToOne
	@JoinColumn(name="ID_TIPO_SITUACAO", referencedColumnName="ID_TIPO_SITUACAO")
	private TipoSituacao tipoSituacao;
	
	@ManyToOne
	@JoinColumn(name="ID_CATEGORIA_MANIFESTACAO", referencedColumnName="ID_CATEGORIA_MANIFESTACAO")
	private CategoriaManifestacao categoriaManifestacao;
	
	@Column(name="SQ_MANIFESTACAO_ANTERIOR")
	private Long idManifestacaoAnterior;
	
	@OneToOne
	@JoinColumn(name = "SQ_USUARIO")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "ID_TIPO_RESPOSTA")
	private TipoResposta tipoResposta;

	@ManyToOne
	@JoinColumn(name="SQ_ENDERECO", referencedColumnName="SQ_ENDERECO")
	private EnderecoDNE endereco;
	
	@ManyToOne
	@JoinColumn(name="SQ_LOCAL_RESPOSTA_MANIFESTACAO", referencedColumnName="SQ_LOCAL_RESPOSTA_MANIFESTACAO")
	private LocalRespostaManifestacao localRespostaManifestacao;

	@Column(name="DS_MANIFESTACAO", length=500)
	private String descricaoManifestacao;
	
	@Column(name="NR_PROCESSO_JUDICIAL_TRAMITE", length=20)
	private String numeroProcessoJudicialTramite;
	
	@Column(name="DT_CADASTRO_MANIFESTACAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@Column(name = "TX_EMAIL_USUARIO", length = 150)
	private String emailUsuario;
	
	@ManyToOne
	@JoinColumn(name = "SG_UF", referencedColumnName = "SG_UF")
	private UF uf;
	
	@OneToMany
	@JoinColumn(name="SQ_MANIFESTACAO_USUARIO")
	@JoinTable(name="ANEXO")
	private List<Anexo> anexos;

	@Override
	public Long getId() {
		return idManifestacaoUsuario;
	}

	/**
	 * @return the idManifestacaoUsuario
	 */
	public Long getIdManifestacaoUsuario() {
		return idManifestacaoUsuario;
	}

	/**
	 * @param idManifestacaoUsuario
	 *            the idManifestacaoUsuario to set
	 */
	public void setIdManifestacaoUsuario(Long idManifestacaoUsuario) {
		this.idManifestacaoUsuario = idManifestacaoUsuario;
	}

	/**
	 * @return the tipoManifestacao
	 */
	public TipoManifestacao getTipoManifestacao() {
		return tipoManifestacao;
	}

	/**
	 * @param tipoManifestacao
	 *            the tipoManifestacao to set
	 */
	public void setTipoManifestacao(TipoManifestacao tipoManifestacao) {
		this.tipoManifestacao = tipoManifestacao;
	}

	/**
	 * @return the tipoSituacao
	 */
	public TipoSituacao getTipoSituacao() {
		return tipoSituacao;
	}

	/**
	 * @param tipoSituacao
	 *            the tipoSituacao to set
	 */
	public void setTipoSituacao(TipoSituacao tipoSituacao) {
		this.tipoSituacao = tipoSituacao;
	}

	/**
	 * @return the categoriaManifestacao
	 */
	public CategoriaManifestacao getCategoriaManifestacao() {
		return categoriaManifestacao;
	}

	/**
	 * @param categoriaManifestacao
	 *            the categoriaManifestacao to set
	 */
	public void setCategoriaManifestacao(CategoriaManifestacao categoriaManifestacao) {
		this.categoriaManifestacao = categoriaManifestacao;
	}

	/**
	 * @return the idManifestacaoAnterior
	 */
	public Long getIdManifestacaoAnterior() {
		return idManifestacaoAnterior;
	}

	/**
	 * @param idManifestacaoAnterior
	 *            the idManifestacaoAnterior to set
	 */
	public void setIdManifestacaoAnterior(Long idManifestacaoAnterior) {
		this.idManifestacaoAnterior = idManifestacaoAnterior;
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
	 * @return the tipoResposta
	 */
	public TipoResposta getTipoResposta() {
		return tipoResposta;
	}

	/**
	 * @param tipoResposta
	 *            the tipoResposta to set
	 */
	public void setTipoResposta(TipoResposta tipoResposta) {
		this.tipoResposta = tipoResposta;
	}

	/**
	 * @return the endereco
	 */
	public EnderecoDNE getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(EnderecoDNE endereco) {
		this.endereco = endereco;
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
	 * @return the descricaoManifestacao
	 */
	public String getDescricaoManifestacao() {
		return descricaoManifestacao;
	}

	/**
	 * @param descricaoManifestacao
	 *            the descricaoManifestacao to set
	 */
	public void setDescricaoManifestacao(String descricaoManifestacao) {
		this.descricaoManifestacao = descricaoManifestacao;
	}

	/**
	 * @return the numeroProcessoJudicialTramite
	 */
	public String getNumeroProcessoJudicialTramite() {
		return numeroProcessoJudicialTramite;
	}

	/**
	 * @param numeroProcessoJudicialTramite
	 *            the numeroProcessoJudicialTramite to set
	 */
	public void setNumeroProcessoJudicialTramite(
			String numeroProcessoJudicialTramite) {
		this.numeroProcessoJudicialTramite = numeroProcessoJudicialTramite;
	}

	/**
	 * @return the dataCadastro
	 */
	public Date getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro
	 *            the dataCadastro to set
	 */
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	/**
	 * @return the emailUsuario
	 */
	public String getEmailUsuario() {
		return emailUsuario;
	}

	/**
	 * @param emailUsuario
	 *            the emailUsuario to set
	 */
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	/**
	 * @return the uf
	 */
	public UF getUf() {
		return uf;
	}

	/**
	 * @param uf
	 *            the uf to set
	 */
	public void setUf(UF uf) {
		this.uf = uf;
	}

	/**
	 * @return the anexos
	 */
	public List<Anexo> getAnexos() {
		return anexos;
	}

	/**
	 * @param anexos
	 *            the anexos to set
	 */
	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}
	
}
