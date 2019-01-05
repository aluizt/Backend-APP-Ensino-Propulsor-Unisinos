package br.com.unisinos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class MensagemChat implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // defini a chave primaria
	private Integer id;
	private String msg;
	private String sala;
	private String usuario;
	private String email;
	private String data;
	private int tipo;
	private int subTipo;
	private String subUsuario;
	
	

	public MensagemChat() {
		
	}
	
	public MensagemChat(String msg, String sala) {
		super();
		this.msg = msg;
		this.sala = sala;
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getSubUsuario() {
		return subUsuario;
	}

	public void setSubUsuario(String subUsuario) {
		this.subUsuario = subUsuario;
	}

	public int getSubTipo() {
		return subTipo;
	}

	public void setSubTipo(int subTipo) {
		this.subTipo = subTipo;
	}

	
	
	
}
