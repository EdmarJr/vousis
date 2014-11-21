package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;
import br.jus.stj.sisouv.entity.enumerators.TipoUsuarioLogin;

/**
 * @author zainer.silva
 * @author francisco.neto
 * 
 */
@Entity
@Table(schema = "SISOUV", name = "USUARIO")
@DiscriminatorColumn(name = "TP_USUARIO_LOGIN")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SQ_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	@ManyToOne
	@JoinColumn(name = "ID_PRONOME_TRATAMENTO", referencedColumnName = "ID_PRONOME_TRATAMENTO")
	private PronomeTratamento pronomeTratamento;

	@ManyToOne
	@JoinColumn(name = "ID_TIPO_RELACIONAMENTO", referencedColumnName = "ID_TIPO_RELACIONAMENTO")
	private TipoRelacionamento tipoRelacionamento;

	@Enumerated(EnumType.STRING)
	@Column(name = "TP_USUARIO_LOGIN", length = 1)
	private TipoUsuarioLogin tipoUsuarioLogin;

	@OneToOne(mappedBy = "usuario")
	private ManifestacaoUsuario manifestacaoUsuario;

	/**
	 * @return the idUsuario
	 */
	public Long getId() {
		return idUsuario;
	}

	/**
	 * @param idUsuario
	 *            the idUsuario to set
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the manifestacaoUsuario
	 */
	public ManifestacaoUsuario getManifestacaoUsuario() {
		return manifestacaoUsuario;
	}

	/**
	 * @param manifestacaoUsuario
	 *            the manifestacaoUsuario to set
	 */
	public void setManifestacaoUsuario(ManifestacaoUsuario manifestacaoUsuario) {
		this.manifestacaoUsuario = manifestacaoUsuario;
	}

	/**
	 * @return the pronomeTratamento
	 */
	public PronomeTratamento getPronomeTratamento() {
		return pronomeTratamento;
	}

	/**
	 * @param pronomeTratamento
	 *            the pronomeTratamento to set
	 */
	public void setPronomeTratamento(PronomeTratamento pronomeTratamento) {
		this.pronomeTratamento = pronomeTratamento;
	}

	/**
	 * @return the tipoRelacionamento
	 */
	public TipoRelacionamento getTipoRelacionamento() {
		return tipoRelacionamento;
	}

	/**
	 * @param tipoRelacionamento
	 *            the tipoRelacionamento to set
	 */
	public void setTipoRelacionamento(TipoRelacionamento tipoRelacionamento) {
		this.tipoRelacionamento = tipoRelacionamento;
	}

	/**
	 * @return the tipoUsuarioLogin
	 */
	public TipoUsuarioLogin getTipoUsuarioLogin() {
		return tipoUsuarioLogin;
	}

	/**
	 * @param tipoUsuarioLogin
	 *            the tipoUsuarioLogin to set
	 */
	public void setTipoUsuarioLogin(TipoUsuarioLogin tipoUsuarioLogin) {
		this.tipoUsuarioLogin = tipoUsuarioLogin;
	}

	public String getNome() {
		// if (this instanceof UsuarioExterno) {
		// return ((UsuarioExterno) this).getNome();
		// } else if (this instanceof UsuarioInterno) {
		// String nomeUsuarioInterno = ((UsuarioInterno) this)
		// .getNomeUsuarioInterno();
		// return nomeUsuarioInterno != null ? nomeUsuarioInterno.split(" ")[0]
		// : null;
		// }
		return null;
	}

	public void setNome(String nome) {
		// if (this instanceof UsuarioExterno) {
		// ((UsuarioExterno) this).setNome(nome);
		// } else if (this instanceof UsuarioInterno) {
		// ((UsuarioInterno) this).setNomeUsuarioInterno(nome);
		// }
	}

	public String getSobrenome() {
		// if (this instanceof UsuarioExterno) {
		// return ((UsuarioExterno) this).getNmSobrenome();
		// } else if (this instanceof UsuarioInterno) {
		// String nomeRetorno = null;
		// String[] split = ((UsuarioInterno) this).getNomeUsuarioInterno()
		// .split(" ");
		// for (int i = 1; i < split.length; i++) {
		// nomeRetorno += split[i] + " ";
		// }
		// return nomeRetorno.trim();
		// }
		return null;
	}

	public void setSobrenome(String nome) {
		if (this instanceof UsuarioExterno) {
			((UsuarioExterno) this).setSobrenome(nome);
		} else if (this instanceof UsuarioInterno) {
			UsuarioInterno usuario = ((UsuarioInterno) this);
			usuario.setNome(usuario.getNome() + " " + nome);
		}
	}

	public String getEmail() {
		// if (this instanceof UsuarioExterno) {
		// return ((UsuarioExterno) this).getTxEmail();
		// } else if (this instanceof UsuarioInterno) {
		// String nomeNick = ((UsuarioInterno) this).getLoginStj()
		// .getNomeNick();
		// return nomeNick + "@stj.jus.br";
		// }
		return null;
	}

}