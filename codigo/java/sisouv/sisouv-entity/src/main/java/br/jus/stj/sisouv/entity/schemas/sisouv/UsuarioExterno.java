/**
 * 
 */
package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.schemas.dne.Ocupacao;
import br.jus.stj.sisouv.entity.schemas.dne.Sinonimo;

/**
 * @author francisco.neto
 *
 */
@Entity
@Table(schema = "SISOUV", name = "USUARIO_EXTERNO")
@DiscriminatorValue("E")
@PrimaryKeyJoinColumn(name = "SQ_USUARIO_EXTERNO", referencedColumnName = "SQ_USUARIO")
public class UsuarioExterno extends Usuario {

	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "ID_ESCOLARIDADE", referencedColumnName = "ID_ESCOLARIDADE")
	@ManyToOne
	private Escolaridade escolaridade;

	@JoinColumn(name = "CD_OCUPACAO", referencedColumnName = "CD_OCUPACAO")
	@ManyToOne
	private Ocupacao ocupacao;

	@JoinColumn(name = "SQ_SINONIMO", referencedColumnName = "SQ_SINONIMO")
	@ManyToOne
	private Sinonimo sinonimo;

	@Column(name = "NM_EMAIL", length = 150)
	private String email;

	@Column(name = "NM_SENHA_MANIFESTANTE", length = 32)
	private String senhaManifestante;

	@Column(name = "NM_NOME", length = 150)
	private String nome;

	@Column(name = "NM_SOBRENOME", length = 150)
	private String sobrenome;

	@Column(name = "NR_CPF", length = 11)
	private String cpf;

	/**
	 * @return the escolaridade
	 */
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	/**
	 * @param escolaridade
	 *            the escolaridade to set
	 */
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	/**
	 * @return the ocupacao
	 */
	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	/**
	 * @param ocupacao
	 *            the ocupacao to set
	 */
	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	/**
	 * @return the sinonimo
	 */
	public Sinonimo getSinonimo() {
		return sinonimo;
	}

	/**
	 * @param sinonimo
	 *            the sinonimo to set
	 */
	public void setSinonimo(Sinonimo sinonimo) {
		this.sinonimo = sinonimo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the senhaManifestante
	 */
	public String getSenhaManifestante() {
		return senhaManifestante;
	}

	/**
	 * @param senhaManifestante
	 *            the senhaManifestante to set
	 */
	public void setSenhaManifestante(String senhaManifestante) {
		this.senhaManifestante = senhaManifestante;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome
	 *            the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}