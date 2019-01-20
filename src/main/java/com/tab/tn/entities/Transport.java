package com.tab.tn.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="transports" , catalog="travel_agency")
public class Transport implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTrans;
	private String ville;
	private Date dateDeb;
	private Date dateFin ;
	private Time heureDeb;
	private Time heureFin;
	private String typeTrans;
	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transport(Long idTrans, String ville, Date dateDeb, Date dateFin, Time heureDeb, Time heureFin,
			String typeTrans) {
		super();
		this.idTrans = idTrans;
		this.ville = ville;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.heureDeb = heureDeb;
		this.heureFin = heureFin;
		this.typeTrans = typeTrans;
	}
	public Long getIdTrans() {
		return idTrans;
	}
	public void setIdTrans(Long idTrans) {
		this.idTrans = idTrans;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Date getDateDeb() {
		return dateDeb;
	}
	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Time getHeureDeb() {
		return heureDeb;
	}
	public void setHeureDeb(Time heureDeb) {
		this.heureDeb = heureDeb;
	}
	public Time getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Time heureFin) {
		this.heureFin = heureFin;
	}
	public String getTypeTrans() {
		return typeTrans;
	}
	public void setTypeTrans(String typeTrans) {
		this.typeTrans = typeTrans;
	}
	
	
}
