package br.jus.stj.sisouv.entity.schemas.dne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;

@Entity
@Table(name="ENDERECO", schema="DNE")
public class EnderecoDNE extends EntidadeBase {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SQ_ENDERECO")
	private Long idEndereco;
	
	@Column(name="CD_IDENTIFICACAO_ENDERECO")
	private Integer codIdentEndereco;
	
	@Column(name="TP_IDENTIFICACAO_ENDERECO", length=2)
	private String tipoIdentEndereco;
	
	@Column(name="NM_LOGRADOURO", length=150)
	private String nomeLogradouro;
	
	@Column(name="DS_COMPLEMENTO", length=150)
	private String dsComplemento;
	
	@Column(name="NR_CEP", length=16)
	private String nrCEP;
	
	public Integer getCodIdentEndereco() {
		return codIdentEndereco;
	}

	public void setCodIdentEndereco(Integer codIdentEndereco) {
		this.codIdentEndereco = codIdentEndereco;
	}

	public String getTipoIdentEndereco() {
		return tipoIdentEndereco;
	}

	public void setTipoIdentEndereco(String tipoIdentEndereco) {
		this.tipoIdentEndereco = tipoIdentEndereco;
	}

	public String getNomeLogradouro() {
		return nomeLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}

	public String getDsComplemento() {
		return dsComplemento;
	}

	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}

	public String getNrCEP() {
		return nrCEP;
	}

	public void setNrCEP(String nrCEP) {
		this.nrCEP = nrCEP;
	}

	@Override
	public Long getId() {
		return idEndereco;
	}
	
}