package com.tab.tn.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hebergements" , catalog="travel_agency")
public class Hebergement implements Serializable {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idHeberg ;
	private String typeHeberg ; 
	private int nbreDispo ;
	
	
	
	public Hebergement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hebergement(Long idHeberg, String typeHeberg, int nbreDispo) {
		super();
		this.idHeberg = idHeberg;
		this.typeHeberg = typeHeberg;
		this.nbreDispo = nbreDispo;
	}

	public Long getIdHeberg() {
		return idHeberg;
	}

	public void setIdHeberg(Long idHeberg) {
		this.idHeberg = idHeberg;
	}

	public String getTypeHeberg() {
		return typeHeberg;
	}

	public void setTypeHeberg(String typeHeberg) {
		this.typeHeberg = typeHeberg;
	}

	public int getNbreDispo() {
		return nbreDispo;
	}

	public void setNbreDispo(int nbreDispo) {
		this.nbreDispo = nbreDispo;
	}
	
	
}
