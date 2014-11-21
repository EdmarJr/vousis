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
@Table(name="BAIRRO", schema="DNE")
public class Bairro extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SQ_BAIRRO")
	private Long idBairro;
	
	@Column(name="NM_BAIRRO", length=72)
	private String nomeBairro;
	
	@ManyToOne
	@JoinColumn(name="SQ_LOCALIDADE", referencedColumnName="SQ_LOCALIDADE")
	private Localidade localidade;
	
	
	public String getNomeBairro() {
		return nomeBairro;
	}
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	public Localidade getLocalidade() {
		return localidade;
	}
	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}
	
	@Override
	public Long getId() {
		return idBairro;
	}
	
}