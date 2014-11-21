package br.jus.stj.sisouv.entity.schemas.dne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;

@Entity
@Table(name="TIPO_LOGRADOURO", schema="DNE")
public class TipoLogradouro extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SQ_TIPO_LOGRADOURO")
	private Long idTipoLogradouro;
	
	@Column(name="NM_TIPO_LOGRADOURO", length=72)
	private String nomeTipoLogradouro;

	@Override
	public Long getId() {
		return idTipoLogradouro;
	}

	public String getNomeTipoLogradouro() {
		return nomeTipoLogradouro;
	}

	public void setNomeTipoLogradouro(String nomeTipoLogradouro) {
		this.nomeTipoLogradouro = nomeTipoLogradouro;
	}
	
}
