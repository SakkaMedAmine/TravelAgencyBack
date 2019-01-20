package com.tab.tn.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vols" , catalog="travel_agency")
public class Vol implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="numero_vol",nullable=false)
	private Long numeroVol;
	private Date  dateDepart ;
	private Date dateArrivee ; 
	private Time heureDepart;
    private Time heureArrivee ;
    private double prix;
    private int nbPlaceReserve;
    private String villeDepart;
	private String villeArrive;
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vol(Long numeroVol, Date dateDepart, Date dateArrivee, Time heureDepart, Time heureArrivee, double prix,
			int nbPlaceReserve, String villeDepart, String villeArrive) {
		super();
		this.numeroVol = numeroVol;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.prix = prix;
		this.nbPlaceReserve = nbPlaceReserve;
		this.villeDepart = villeDepart;
		this.villeArrive = villeArrive;
	}
	public Long getNumeroVol() {
		return numeroVol;
	}
	public void setNumeroVol(Long numeroVol) {
		this.numeroVol = numeroVol;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Date getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public Time getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(Time heureDepart) {
		this.heureDepart = heureDepart;
	}
	public Time getHeureArrivee() {
		return heureArrivee;
	}
	public void setHeureArrivee(Time heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getNbPlaceReserve() {
		return nbPlaceReserve;
	}
	public void setNbPlaceReserve(int nbPlaceReserve) {
		this.nbPlaceReserve = nbPlaceReserve;
	}
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	public String getVilleArrive() {
		return villeArrive;
	}
	public void setVilleArrive(String villeArrive) {
		this.villeArrive = villeArrive;
	}
	
	
}
