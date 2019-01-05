package br.com.unisinos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Monitoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // defini a chave primaria
	private Integer id;
	private String inicio;
	private String descricao;
	private Integer campus;
	private String segunda1,terca1,quarta1,quinta1,sexta1,sabado1;
	private String segunda2,terca2,quarta2,quinta2,sexta2,sabado2;
	private String segunda3,terca3,quarta3,quinta3,sexta3,sabado3;
	private String segunda4,terca4,quarta4,quinta4,sexta4,sabado4;
	
	
	//@JsonBackReference
	@JsonIgnore
	@ManyToMany 
	@JoinTable(name="AREAS_MONITORIA", 
	          joinColumns = @JoinColumn(name = "monitoria_id"), 
	          inverseJoinColumns = @JoinColumn(name = "area_id")
	)
	private List<Areas> areas = new ArrayList<>();//cria a associação entre subcategoria e categoria
	

	public Monitoria() {

	}


	public Monitoria(Integer id,String inicio, String descricao, Integer campus, String segunda1, String terca1, String quarta1,
			String quinta1, String sexta1, String sabado1, String segunda2, String terca2, String quarta2,
			String quinta2, String sexta2, String sabado2, String segunda3, String terca3, String quarta3,
			String quinta3, String sexta3, String sabado3, String segunda4, String terca4, String quarta4,
			String quinta4, String sexta4, String sabado4) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.descricao = descricao;
		this.campus = campus;
		this.segunda1 = segunda1;
		this.terca1 = terca1;
		this.quarta1 = quarta1;
		this.quinta1 = quinta1;
		this.sexta1 = sexta1;
		this.sabado1 = sabado1;
		this.segunda2 = segunda2;
		this.terca2 = terca2;
		this.quarta2 = quarta2;
		this.quinta2 = quinta2;
		this.sexta2 = sexta2;
		this.sabado2 = sabado2;
		this.segunda3 = segunda3;
		this.terca3 = terca3;
		this.quarta3 = quarta3;
		this.quinta3 = quinta3;
		this.sexta3 = sexta3;
		this.sabado3 = sabado3;
		this.segunda4 = segunda4;
		this.terca4 = terca4;
		this.quarta4 = quarta4;
		this.quinta4 = quinta4;
		this.sexta4 = sexta4;
		this.sabado4 = sabado4;
		
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getInicio() {
		return inicio;
	}


	public void setInicio(String inicio) {
		this.inicio = inicio;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Areas> getAreas() {
		return areas;
	}

	public void setAreas(List<Areas> areas) {
		this.areas = areas;
	}
	
	public Integer getCampus() {
		return campus;
	}

	public void setCampus(Integer campus) {
		this.campus = campus;
	}

	public String getSegunda1() {
		return segunda1;
	}

	public void setSegunda1(String segunda1) {
		this.segunda1 = segunda1;
	}

	public String getTerca1() {
		return terca1;
	}

	public void setTerca1(String terca1) {
		this.terca1 = terca1;
	}

	public String getQuarta1() {
		return quarta1;
	}

	public void setQuarta1(String quarta1) {
		this.quarta1 = quarta1;
	}

	public String getQuinta1() {
		return quinta1;
	}

	public void setQuinta1(String quinta1) {
		this.quinta1 = quinta1;
	}

	public String getSexta1() {
		return sexta1;
	}

	public void setSexta1(String sexta1) {
		this.sexta1 = sexta1;
	}

	public String getSabado1() {
		return sabado1;
	}

	public void setSabado1(String sabado1) {
		this.sabado1 = sabado1;
	}

	public String getSegunda2() {
		return segunda2;
	}

	public void setSegunda2(String segunda2) {
		this.segunda2 = segunda2;
	}

	public String getTerca2() {
		return terca2;
	}

	public void setTerca2(String terca2) {
		this.terca2 = terca2;
	}

	public String getQuarta2() {
		return quarta2;
	}

	public void setQuarta2(String quarta2) {
		this.quarta2 = quarta2;
	}

	public String getQuinta2() {
		return quinta2;
	}

	public void setQuinta2(String quinta2) {
		this.quinta2 = quinta2;
	}

	public String getSexta2() {
		return sexta2;
	}

	public void setSexta2(String sexta2) {
		this.sexta2 = sexta2;
	}

	public String getSabado2() {
		return sabado2;
	}

	public void setSabado2(String sabado2) {
		this.sabado2 = sabado2;
	}

	public String getSegunda3() {
		return segunda3;
	}

	public void setSegunda3(String segunda3) {
		this.segunda3 = segunda3;
	}

	public String getTerca3() {
		return terca3;
	}

	public void setTerca3(String terca3) {
		this.terca3 = terca3;
	}

	public String getQuarta3() {
		return quarta3;
	}

	public void setQuarta3(String quarta3) {
		this.quarta3 = quarta3;
	}

	public String getQuinta3() {
		return quinta3;
	}

	public void setQuinta3(String quinta3) {
		this.quinta3 = quinta3;
	}

	public String getSexta3() {
		return sexta3;
	}

	public void setSexta3(String sexta3) {
		this.sexta3 = sexta3;
	}

	public String getSabado3() {
		return sabado3;
	}

	public void setSabado3(String sabado3) {
		this.sabado3 = sabado3;
	}

	public String getSegunda4() {
		return segunda4;
	}

	public void setSegunda4(String segunda4) {
		this.segunda4 = segunda4;
	}

	public String getTerca4() {
		return terca4;
	}

	public void setTerca4(String terca4) {
		this.terca4 = terca4;
	}

	public String getQuarta4() {
		return quarta4;
	}

	public void setQuarta4(String quarta4) {
		this.quarta4 = quarta4;
	}

	public String getQuinta4() {
		return quinta4;
	}

	public void setQuinta4(String quinta4) {
		this.quinta4 = quinta4;
	}

	public String getSexta4() {
		return sexta4;
	}

	public void setSexta4(String sexta4) {
		this.sexta4 = sexta4;
	}

	public String getSabado4() {
		return sabado4;
	}

	public void setSabado4(String sabado4) {
		this.sabado4 = sabado4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Monitoria other = (Monitoria) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
