package com.tab.tn.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReservationVolId implements Serializable {
	
	@Column(name="rv_client_fk",nullable=false)
	private Long idClient;
	@Column(name="rv_vol_fk",nullable=false)
	private Long idVol;	

}
