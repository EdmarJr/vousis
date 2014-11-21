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
@Table(name="SINONIMO")
public class Sinonimo extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SQ_SINONIMO")
	private Long idSinonimo;
	
	@ManyToOne
	@JoinColumn(name="CD_OCUPACAO", referencedColumnName="CD_OCUPACAO")
	private Ocupacao ocupacao;
	
	@Column(name="NM_SINONIMO", length=100)
	private String nomeSinonimo;

	@Override
	public Long getId() {
		return idSinonimo;
	}

	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	public String getNomeSinonimo() {
		return nomeSinonimo;
	}

	public void setNomeSinonimo(String nomeSinonimo) {
		this.nomeSinonimo = nomeSinonimo;
	}
	
}
