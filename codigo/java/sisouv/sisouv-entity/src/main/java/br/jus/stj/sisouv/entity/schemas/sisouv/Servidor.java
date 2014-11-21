/**
 * 
 */
package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;

/**
 * @author zainer.silva
 * 
 */
@Entity
@Table(schema = "SISOUV", name = "SERVIDOR_STJ_RH")
public class Servidor extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_MATRICULA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOME_SERVIDOR", length = 100)
	private String nomeServidor;
	@Column(name = "DESC_ENDERECO", length = 100)
	private String endereco;
	@Column(name = "DESC_COMPLEMENTO", length = 100)
	private String complemento;
	@Column(name = "DESC_BAIRRO", length = 100)
	private String bairro;
	@Column(name = "DESC_CIDADE", length = 100)
	private String cidade;
	@Column(name = "IND_UF", length = 2)
	private String uf;
	@Column(name = "NUM_CEP", length = 11)
	private String CEP;
	@Column(name = "DESC_TELEFONE", length = 11)
	private String telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeServidor() {
		return nomeServidor;
	}

	public void setNomeServidor(String nomeServidor) {
		this.nomeServidor = nomeServidor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
