package br.com.unisinos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Evento  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // defini a chave primaria
	private Integer id;
	private String descricao;
	private Date data;
	@Transient  // este atributo nao fara parte do bd
	private Integer idArea;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="AREAS_EVENTOS", 
	          joinColumns = @JoinColumn(name = "evento_id"), 
	          inverseJoinColumns = @JoinColumn(name = "area_id")
	)
	private List<Areas> areas = new ArrayList<>();//cria a associação entre areas e evento
	
	public Evento() {
		
	}
	
	public Evento(Integer id, String descricao, Date data) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.data = data;
	}

	public Evento(Integer id, String descricao, Date data, Integer area) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.idArea = area;
		
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Areas> getAreas() {
		return areas;
	}

	public void setAreas(List<Areas> areas) {
		this.areas = areas;
	}
	
	@Transient  // este atributo nao fara parte do bd
	public Integer getIdArea() {
		return idArea;
	}
	
	@Transient  // este atributo nao fara parte do bd
	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
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
		Evento other = (Evento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
