package com.ufc.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigoProjeto;
	
	@NotBlank(message = "Preencha o TITULO do Projeto")
	private String titulo;
	
	@NotBlank(message = "Preencha a DURAÇÃO do Projeto")
	private String duracao;
	
	@NotBlank(message = "Preencha a INSTITUIÇÃO do Projeto")
	private String instituicao;
	
	@NotBlank(message = "Preencha a DESCRIÇÃO do Projeto")
	private String descricao;
	
	private String relevancia = "-";
	
	@NotBlank(message = "Preencha o DATA DE SUBMISSÃO do Projeto")
	private String pesqProjeto;
	
	@NotBlank(message = "Preencha o DATA DE SUBMISSÃO do Projeto")
	private String dataSub;
	
		
	public Long getCodigoProjeto() {
		return codigoProjeto;
	}
	public void setCodigoProjeto(Long codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getRelevancia() {
		return relevancia;
	}
	public void setRelevancia(String relevancia) {
		this.relevancia = relevancia;
	}
	public String getDataSub() {
		return dataSub;
	}
	public void setDataSub(String dataSub) {
		this.dataSub = dataSub;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPesqProjeto() {
		return pesqProjeto;
	}
	public void setPesqProjeto(String pesqProjeto) {
		this.pesqProjeto = pesqProjeto;
	}	
	
}