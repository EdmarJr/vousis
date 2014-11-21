package br.jus.stj.sisouv.entity.vo;

import java.util.List;

import br.jus.stj.sisouv.entity.schemas.dne.UF;
import br.jus.stj.sisouv.entity.schemas.sisouv.Escolaridade;
import br.jus.stj.sisouv.entity.schemas.sisouv.Profissao;
import br.jus.stj.sisouv.entity.schemas.sisouv.PronomeTratamento;
import br.jus.stj.sisouv.entity.schemas.sisouv.TipoManifestacao;
import br.jus.stj.sisouv.entity.schemas.sisouv.TipoRelacionamento;
import br.jus.stj.sisouv.entity.schemas.sisouv.TipoResposta;

public class ParametrosDisponiveisInclusaoManifestacaoVO {
	private List<TipoRelacionamento> listaTipoRelacionamento;
	private List<TipoResposta> listaTipoResposta;
	private List<UF> listaUF;
	private List<Profissao> listaProfissao;
	private List<Escolaridade> listaEscolaridade;
	private List<PronomeTratamento> listaPronomeTratamento;
	private List<TipoManifestacao> listaTipoManifestacao;

	public List<TipoRelacionamento> getListaTipoRelacionamento() {
		return listaTipoRelacionamento;
	}

	public void setListaTipoRelacionamento(
			List<TipoRelacionamento> listaTipoRelacionamento) {
		this.listaTipoRelacionamento = listaTipoRelacionamento;
	}

	public List<TipoResposta> getListaTipoResposta() {
		return listaTipoResposta;
	}

	public void setListaTipoResposta(List<TipoResposta> listaTipoResposta) {
		this.listaTipoResposta = listaTipoResposta;
	}

	public List<UF> getListaUF() {
		return listaUF;
	}

	public void setListaUF(List<UF> listaUF) {
		this.listaUF = listaUF;
	}

	public List<Profissao> getListaProfissao() {
		return listaProfissao;
	}

	public void setListaProfissao(List<Profissao> listaProfissao) {
		this.listaProfissao = listaProfissao;
	}

	public List<Escolaridade> getListaEscolaridade() {
		return listaEscolaridade;
	}

	public void setListaEscolaridade(List<Escolaridade> listaEscolaridade) {
		this.listaEscolaridade = listaEscolaridade;
	}

	public List<PronomeTratamento> getListaPronomeTratamento() {
		return listaPronomeTratamento;
	}

	public void setListaPronomeTratamento(
			List<PronomeTratamento> listaPronomeTratamento) {
		this.listaPronomeTratamento = listaPronomeTratamento;
	}

	public List<TipoManifestacao> getListaTipoManifestacao() {
		return listaTipoManifestacao;
	}

	public void setListaTipoManifestacao(
			List<TipoManifestacao> listaTipoManifestacao) {
		this.listaTipoManifestacao = listaTipoManifestacao;
	}

}
