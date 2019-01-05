package br.com.unisinos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Areas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // defini a chave primaria
	private Integer id;
	private String nome;
	 
	@ManyToMany(mappedBy = "areas")
	private List<Monitoria> monitorias = new ArrayList<>();
 
	@ManyToMany(mappedBy = "areas")
	private List<Evento> eventos = new ArrayList<>();
	
	
	public Areas() {
		
	}
	
	public Areas(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	public List<Monitoria> getMonitorias() {
		return monitorias;
	}

	public List<Evento> getEventos(){
		return eventos;
	}
	
	public void setMonitorias(List<Monitoria> monitorias) {
		this.monitorias = monitorias;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Areas other = (Areas) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
