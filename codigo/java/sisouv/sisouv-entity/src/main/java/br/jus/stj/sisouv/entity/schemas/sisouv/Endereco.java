package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;
import br.jus.stj.sisouv.entity.schemas.dne.Bairro;
import br.jus.stj.sisouv.entity.schemas.dne.Localidade;
import br.jus.stj.sisouv.entity.schemas.dne.UF;

@Entity
@Table(schema = "SISOUV", name = "ENDERECO")
public class Endereco extends EntidadeBase {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SQ_ENDERECO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;
	
	@ManyToOne
	@JoinColumn(name="SG_UF", referencedColumnName="SG_UF")
	private UF uf;
	
	@ManyToOne
	@JoinColumn(name="SQ_LOCALIDADE", referencedColumnName="SQ_LOCALIDADE")
	private Localidade localidade;
	
	@ManyToOne
	@JoinColumn(name="SQ_BAIRRO", referencedColumnName="SQ_BAIRRO")
	private Bairro bairro;
	
	@Column(name="NR_CEP", length=16)
	private String nrCep;
	
	@Column(name="NM_ENDERECO", length=100)
	private String nomeEndereco;
	
	@Column(name="DS_COMPLEMENTO", length=100)
	private String descComplemento;
	
	@Column(name="NR_ENDERECO", length=10)
	private String numeroEndereco;

	@Override
	public Long getId() {
		return idEndereco;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public String getNrCep() {
		return nrCep;
	}

	public void setNrCep(String nrCep) {
		this.nrCep = nrCep;
	}

	public String getNomeEndereco() {
		return nomeEndereco;
	}

	public void setNomeEndereco(String nomeEndereco) {
		this.nomeEndereco = nomeEndereco;
	}

	public String getDescComplemento() {
		return descComplemento;
	}

	public void setDescComplemento(String descComplemento) {
		this.descComplemento = descComplemento;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	
	
}
