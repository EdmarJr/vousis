package br.jus.stj.sisouv.entity.schemas.dne;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;

@Table
@Entity(name="GRUPO")
public class Grupo extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_GRUPO")
	private Long idGrupo;
	
	@ManyToOne
	private Grupo grupoPai;
	
	@OneToMany(mappedBy="grupoPai")
	private List<Grupo> gruposFilho;
	
	@Column(name="NM_GRUPO", length=100)
	private String nomeGrupo;
	
	@Column(name="TP_GRUPO", length=2)
	private String tipoGrupo;
	
	public String getNomeGrupo() {
		return nomeGrupo;
	}

	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}

	public String getTipoGrupo() {
		return tipoGrupo;
	}

	public void setTipoGrupo(String tipoGrupo) {
		this.tipoGrupo = tipoGrupo;
	}

	@Override
	public Long getId() {
		return idGrupo;
	}
	
}