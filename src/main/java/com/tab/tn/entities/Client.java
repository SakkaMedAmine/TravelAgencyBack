package com.tab.tn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity 
@Table(name="clients" , catalog="travel_agency")
public class Client implements Serializable {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client",nullable=false)
	private Long idClt;
    private String cinClt;
    private String nomClt;
    private String prenomClt;
    private int ageClt;
    private String adresseClt;
    private String telClt;
    private String mailClt;
   
    @ManyToMany
    @JoinTable(name="reservations_vol",catalog="travel_agency",
    joinColumns= {@JoinColumn(name="rv_client_fk",nullable=false,updatable=false)},
    inverseJoinColumns= {@JoinColumn(name="rv_vol_fk",nullable=false,updatable=false)})
    private List<Vol> volsReserves= new ArrayList<>() ;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Long idClt, String cinClt, String nomClt, String prenomClt, int ageClt, String adresseClt,
			String telClt, String mailClt, List<Vol> volsReserves) {
		super();
		this.idClt = idClt;
		this.cinClt = cinClt;
		this.nomClt = nomClt;
		this.prenomClt = prenomClt;
		this.ageClt = ageClt;
		this.adresseClt = adresseClt;
		this.telClt = telClt;
		this.mailClt = mailClt;
		this.volsReserves = volsReserves;
	}

	public Long getIdClt() {
		return idClt;
	}

	public void setIdClt(Long idClt) {
		this.idClt = idClt;
	}

	public String getCinClt() {
		return cinClt;
	}

	public void setCinClt(String cinClt) {
		this.cinClt = cinClt;
	}

	public String getNomClt() {
		return nomClt;
	}

	public void setNomClt(String nomClt) {
		this.nomClt = nomClt;
	}

	public String getPrenomClt() {
		return prenomClt;
	}

	public void setPrenomClt(String prenomClt) {
		this.prenomClt = prenomClt;
	}

	public int getAgeClt() {
		return ageClt;
	}

	public void setAgeClt(int ageClt) {
		this.ageClt = ageClt;
	}

	public String getAdresseClt() {
		return adresseClt;
	}

	public void setAdresseClt(String adresseClt) {
		this.adresseClt = adresseClt;
	}

	public String getTelClt() {
		return telClt;
	}

	public void setTelClt(String telClt) {
		this.telClt = telClt;
	}

	public String getMailClt() {
		return mailClt;
	}

	public void setMailClt(String mailClt) {
		this.mailClt = mailClt;
	}

	public List<Vol> getVolsReserves() {
		return volsReserves;
	}

	public void setVolsReserves(List<Vol> volsReserves) {
		this.volsReserves = volsReserves;
	}
    
    
}
