package br.com.unisinos.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ChatPortugues implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // defini a chave primaria
	private Integer id;
    private String usuario;
    private String email;
    private String msg;
    private String data;
    private int tipo;
    private int subTipo;
    private String subUsuario;
   
    
    
    
    public ChatPortugues() {
    	
    }
    
	public ChatPortugues(Integer id, String usuario, String email, String msg) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.email = email;
		this.msg = msg;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChatPortugues other = (ChatPortugues) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
    
}
