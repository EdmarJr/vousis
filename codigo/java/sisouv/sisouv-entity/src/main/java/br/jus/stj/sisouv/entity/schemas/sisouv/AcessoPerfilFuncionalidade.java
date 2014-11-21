/**
 * 
 */
package br.jus.stj.sisouv.entity.schemas.sisouv;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import br.jus.stj.sisouv.entity.EntidadeBase;
import br.jus.stj.sisouv.entity.schemas.sisouv.embeddable.IdAcessoPerfilFuncionalidade;

/**
 * @author francisco.neto
 * 
 */
@Table(schema = "SISOUV", name = "ACESSO_PERFIL_FUNCIONALIDADE")
@Entity
public class AcessoPerfilFuncionalidade extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	public AcessoPerfilFuncionalidade() {
		id = new IdAcessoPerfilFuncionalidade();
	}

	@EmbeddedId
	private IdAcessoPerfilFuncionalidade id;

	@MapsId("idPerfilFuncionalidade")
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "SQ_FUNCIONALIDADE", referencedColumnName = "SQ_FUNCIONALIDADE"),
			@JoinColumn(name = "SQ_PERFIL", referencedColumnName = "SQ_PERFIL") })
	private PerfilFuncionalidade perfilFuncionalidade;

	@MapsId("idTipoAcesso")
	@ManyToOne
	@JoinColumn(name = "SQ_TIPO_ACESSO", referencedColumnName = "SQ_TIPO_ACESSO")
	private TipoAcesso tipoAcesso;

	@Override
	public Long getId() {
		return null;
	}

	/**
	 * @return the perfilFuncionalidade
	 */
	public PerfilFuncionalidade getPerfilFuncionalidade() {
		return perfilFuncionalidade;
	}

	/**
	 * @param perfilFuncionalidade
	 *            the perfilFuncionalidade to set
	 */
	public void setPerfilFuncionalidade(
			PerfilFuncionalidade perfilFuncionalidade) {
		this.perfilFuncionalidade = perfilFuncionalidade;
	}

	/**
	 * @return the tipoAcesso
	 */
	public TipoAcesso getTipoAcesso() {
		return tipoAcesso;
	}

	/**
	 * @param tipoAcesso
	 *            the tipoAcesso to set
	 */
	public void setTipoAcesso(TipoAcesso tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(IdAcessoPerfilFuncionalidade id) {
		this.id = id;
	}

}