package com.generic.api.documentation.controller.dto;

import java.util.List;

public class TesteRetornoDTO {

	private List<TesteDTO> listaTestesRetorno;

	public TesteRetornoDTO() {}

	public TesteRetornoDTO( List<TesteDTO> listaTestesRetorno ) {
		this.listaTestesRetorno = listaTestesRetorno;
	}

	public List<TesteDTO> getListaTestesRetorno() {
		return listaTestesRetorno;
	}

	public void setListaTestesRetorno( List<TesteDTO> listaTestesRetorno ) {
		this.listaTestesRetorno = listaTestesRetorno;
	}

}
