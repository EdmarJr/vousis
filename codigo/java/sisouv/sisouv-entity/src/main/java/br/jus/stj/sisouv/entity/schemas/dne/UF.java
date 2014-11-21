package br.jus.stj.sisouv.entity.schemas.dne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;

@Entity
@Table(name="UF", schema="DNE")
public class UF extends EntidadeBase {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SG_UF", length=2)
	private String sgUF;

	@Column(name="NM_UF", length=72)
	private String nomeUF;

	public String getSgUF() {
		return sgUF;
	}

	public void setSgUF(String sgUF) {
		this.sgUF = sgUF;
	}

	public String getNomeUF() {
		return nomeUF;
	}

	public void setNomeUF(String nomeUF) {
		this.nomeUF = nomeUF;
	}

	@Override
	public Long getId() {
		return null;
	}

}
