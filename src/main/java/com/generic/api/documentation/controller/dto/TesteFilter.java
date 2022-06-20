package com.generic.api.documentation.controller.dto;

import com.generic.api.documentation.controller.enums.TipoTesteEnum;

public class TesteFilter {

	private Long id;
	private String nome;
	private TipoTesteEnum tipo;

	public TesteFilter() {}

	public TesteFilter( Long id, String nome, TipoTesteEnum tipo ) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
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

}
