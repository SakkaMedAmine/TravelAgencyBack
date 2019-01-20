package com.tab.tn.entities;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="reservations_vol" , catalog="travel_agency")
public class ReservationVol implements Serializable {

	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name="rvClientFk",column=@Column(name="rv_client_fk",nullable=false)),
		@AttributeOverride(name="rvVolFk",column=@Column(name="rv_vol_fk",nullable=false))
	})
	private ReservationVolId id ;

	public ReservationVol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservationVol(ReservationVolId id) {
		super();
		this.id = id;
	}

	public ReservationVolId getId() {
		return id;
	}

	public void setId(ReservationVolId id) {
		this.id = id;
	}
	
	
}
