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
@Table(name="OCUPACAO")
public class Ocupacao extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_OCUPACAO")
	private Long idOcupacao;
	
	@ManyToOne
	@JoinColumn(name="CD_GRUPO", referencedColumnName="CD_GRUPO")
	private Grupo grupo;
	
	@Column(name="NM_OCUPACAO", length=100)
	private String nomeOcupacao;

	@Override
	public Long getId() {
		return idOcupacao;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getNomeOcupacao() {
		return nomeOcupacao;
	}

	public void setNomeOcupacao(String nomeOcupacao) {
		this.nomeOcupacao = nomeOcupacao;
	}
	
}