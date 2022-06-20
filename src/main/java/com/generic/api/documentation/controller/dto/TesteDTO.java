package com.generic.api.documentation.controller.dto;

import java.util.List;

import com.generic.api.documentation.controller.enums.TipoTesteEnum;

public class TesteDTO {

	private Long id;
	private String nome;
	private TipoTesteEnum tipo;
	private List<TesteRetornoDTO> testes;

	public TesteDTO() {}

	public TesteDTO( Long id, String nome, TipoTesteEnum tipo, List<TesteRetornoDTO> testes ) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.testes = testes;
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public TipoTesteEnum getTipo() {
		return tipo;
	}

	public void setTipo( TipoTesteEnum tipo ) {
		this.tipo = tipo;
	}

	public List<TesteRetornoDTO> getTestes() {
		return testes;
	}

	public void setTestes( List<TesteRetornoDTO> testes ) {
		this.testes = testes;
	}

}
