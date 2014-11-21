package br.jus.stj.sisouv.entity.schemas.dne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;

@Entity
@Table(name="LOCALIDADE", schema="DNE")
public class Localidade extends EntidadeBase {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SQ_LOCALIDADE")
	private Long idLocalidade;
	
	@Column(name="NM_LOCALIDADE", length=60)
	private String nomeLocalidade;
	
	@ManyToOne
	@JoinColumn(name="SG_UF", referencedColumnName = "SG_UF")
	private UF uf;
	
	@Override
	public Long getId() {
		return idLocalidade;
	}

	public String getNomeLocalidade() {
		return nomeLocalidade;
	}

	public void setNomeLocalidade(String nomeLocalidade) {
		this.nomeLocalidade = nomeLocalidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}
	
}