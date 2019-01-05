package br.com.unisinos.domain;

import java.io.Serializable;

public class Email implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;
	private String assunto;
	private String texto;

	
	
	public Email(String email, String assunto, String texto) {
		super();
		this.email = email;
		this.assunto = assunto;
		this.texto = texto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
