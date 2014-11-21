package br.jus.stj.sisouv.util.login;

import java.security.acl.Group;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import javax.sql.DataSource;

import br.jus.stj.commons.ldap.AutenticadorLdap;
import br.jus.stj.commons.ldap.vo.UsuarioVO;
import br.jus.stj.commons.util.HashUtils;

public class loginController implements LoginModule {

	private final static String SUFIXO_EMAIL_STJ = "@stj.jus.br";
	private static AutenticadorLdap autenticadorLdap = null;

	private boolean commitSucceeded = false;
	private boolean succeeded = false;

	private User user;
	private Set<Role> roles = new HashSet();

	protected Subject subject;
	protected CallbackHandler callbackHandler;
	protected Map sharedState;
	private String dataSourceName;
	private String sqlUser;
	private String sqlRoles;

	public void initialize(Subject subject, CallbackHandler callbackHandler,
			Map sharedState, Map options) {
		autenticadorLdap = new AutenticadorLdap();
		this.subject = subject;
		this.callbackHandler = callbackHandler;
		this.sharedState = sharedState;
		dataSourceName = (String) options.get("dataSourceName");
		sqlUser = (String) options.get("sqlUser");
		sqlRoles = (String) options.get("sqlRoles");
	}

	public boolean login() throws LoginException {
		// recupera o login e senha informados no form
		getUsernamePassword();

		Connection conn = null;
		try {
			// obtem a conexão
			try {
				Context initContext = new InitialContext();
				DataSource ds = (DataSource) initContext
						.lookup("java:jboss/datasources/sisouv_MSSQL");
				conn = ds.getConnection();
			} catch (NamingException e) {
				succeeded = false;
				throw new LoginException("Erro ao recuperar DataSource: "
						+ e.getClass().getName() + ": " + e.getMessage());
			} catch (SQLException e) {
				succeeded = false;
				throw new LoginException("Erro ao obter conexão: "
						+ e.getClass().getName() + ": " + e.getMessage());
			}
			// valida o usuario
			validarUsuario(conn);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

		sharedState.put("javax.security.auth.principal", sqlUser);
		sharedState.put("javax.security.auth.roles", roles);

		return true;
	}

	public boolean commit() throws LoginException {
		// adiciona o usuario no principals
		if (user != null && !subject.getPrincipals().contains(user)) {
			subject.getPrincipals().add(user);
		}

		Group grupo = new GroupImpl("Roles");
		grupo.addMember(new Role("ADMINISTRADOR"));

		subject.getPrincipals().add(grupo);

		commitSucceeded = true;

		return true;
	}

	public boolean abort() throws LoginException {
		if (!succeeded) {
			return false;
		} else if (succeeded && !commitSucceeded) {
			succeeded = false;
		} else {
			succeeded = false;
			logout();
		}

		this.subject = null;
		this.callbackHandler = null;
		this.sharedState = null;
		this.roles = new HashSet();

		return succeeded;
	}

	public boolean logout() throws LoginException {
		subject.getPrincipals().removeAll(roles);
		subject.getPrincipals().remove(user);
		return true;
	}

	/**
	 * Valida login e senha no banco
	 * 
	 * @param conn
	 */
	private void validarUsuario(Connection conn) throws LoginException {
		if (!isUsuarioInterno(loginInformado)) {
			senhaInformado = HashUtils.gerarHashPorMD5(senhaInformado);
		}
		PreparedStatement statement = null;
		ResultSet rs = null;
		try {
			if (isUsuarioInterno(loginInformado)) {
				String nomeUsuario = efetuarLoginUsuarioInterno(loginInformado,
						senhaInformado);
				if (nomeUsuario != null) {
					user = new User(loginInformado);
					return;
				} else {
					throw new LoginException(
							"Usuário ou senha estão incorretos");
				}
			} else {
				sqlUser = "select * from SISOUV.USUARIO_EXTERNO where TX_EMAIL=? AND TX_SENHA_MANIFESTANTE=?";
				statement = conn.prepareStatement(sqlUser);
				statement.setString(1, loginInformado);
				statement.setString(2, senhaInformado);
				rs = statement.executeQuery();
				if (rs.next()) {
					user = new User(loginInformado);
					recuperaRoles(conn);
					user.setRoles(roles);
				} else {
					succeeded = false;
					throw new LoginException("Usuário não localizado.");
				}
			}
		} catch (SQLException e) {
			succeeded = false;
			throw new LoginException("Erro ao abrir sessão: "
					+ e.getClass().getName() + ": " + e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (statement != null)
					statement.close();
			} catch (Exception e) {

			}
		}

	}

	/**
	 * Login do usuário.
	 */
	protected String loginInformado;

	/**
	 * Senha do usuário.
	 */
	protected String senhaInformado;

	/**
	 * Obtem o login e senha digitados
	 */
	protected void getUsernamePassword() throws LoginException {
		if (callbackHandler == null)
			throw new LoginException(
					"Error: no CallbackHandler available to garner authentication information from the user");

		Callback[] callbacks = new Callback[2];
		callbacks[0] = new NameCallback("Login");
		callbacks[1] = new PasswordCallback("Senha", false);
		try {
			callbackHandler.handle(callbacks);
			loginInformado = ((NameCallback) callbacks[0]).getName();
			char[] tmpPassword = ((PasswordCallback) callbacks[1])
					.getPassword();
			senhaInformado = new String(tmpPassword);
			((PasswordCallback) callbacks[1]).clearPassword();
		} catch (java.io.IOException ioe) {
			throw new LoginException(ioe.toString());
		} catch (UnsupportedCallbackException uce) {
			throw new LoginException(
					"Error: "
							+ uce.getCallback().toString()
							+ " not available to garner authentication information from the user");
		}
	}

	public void recuperaRoles(Connection conn) throws LoginException {
		roles.add(new Role("ADMINISTRADOR"));
	}

	private static String efetuarLoginUsuarioInterno(String usuario,
			String senha) {
		if (usuario.indexOf("@") != -1) {
			usuario = removerSufixoEmailStj(usuario);
		}
		UsuarioVO usuarioVO = new UsuarioVO(usuario, senha);
		boolean autenticado = autenticadorLdap.autenticarUsuario(usuarioVO);
		if (!autenticado)
			return null;
		return usuario;
	}

	private static boolean isUsuarioInterno(String usuario) {
		if (usuario.endsWith(SUFIXO_EMAIL_STJ) || usuario.indexOf("@") == -1)
			return true;
		else
			return false;
	}

	private static String removerSufixoEmailStj(String usuario) {
		return usuario.substring(0,
				usuario.length() - SUFIXO_EMAIL_STJ.length());
	}

}
