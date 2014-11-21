/**
 * 
 */
package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author francisco.neto
 *
 */
@Entity
@Table(schema = "SISOUV", name = "USUARIO_INTERNO")
@DiscriminatorValue("I")
@PrimaryKeyJoinColumn(name = "SQ_USUARIO_INTERNO", referencedColumnName = "SQ_USUARIO")
public class UsuarioInterno extends Usuario {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "SEQ_LOGIN_REDE_STJ", referencedColumnName = "seq_login_rede_stj")
	private LoginRedeSTJ loginRedeSTJ;

	/**
	 * @return the loginRedeSTJ
	 */
	public LoginRedeSTJ getLoginRedeSTJ() {
		return loginRedeSTJ;
	}

	/**
	 * @param loginRedeSTJ
	 *            the loginRedeSTJ to set
	 */
	public void setLoginRedeSTJ(LoginRedeSTJ loginRedeSTJ) {
		this.loginRedeSTJ = loginRedeSTJ;
	}

}
