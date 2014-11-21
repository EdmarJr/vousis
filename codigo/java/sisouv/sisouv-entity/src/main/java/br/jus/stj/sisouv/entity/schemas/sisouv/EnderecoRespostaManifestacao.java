package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.schemas.dne.EnderecoDNE;

@Entity
@Table(schema = "SISOUV", name = "ENDERECO_RESPOSTA_MANIFESTACAO")
public class EnderecoRespostaManifestacao {
	@Id
	@Column(name = "SQ_ENDERECO_RESPOSTA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SQ_ENDERECO", referencedColumnName = "SQ_ENDERECO")
	private EnderecoDNE endereco;

	public EnderecoRespostaManifestacao() {
		endereco = new EnderecoDNE();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EnderecoDNE getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDNE endereco) {
		this.endereco = endereco;
	}

}
