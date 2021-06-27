package br.com.carlosjunior.forum.controller.dto;

public class ErroFormDto {

	private String campo;
	private String erro;

	public ErroFormDto(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}

}
