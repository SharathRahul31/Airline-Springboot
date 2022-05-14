package com.faith.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flights {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "flightid")
	   private Integer flightId;
	   
	   @Column(name = "flightname",nullable = false, length=60)
	   private String flightName;

	   public Flights() {
		super();
		
	}

	public Flights(Integer flightId, String flightName) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer departmentId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + "]";
	}
	   
	   
	   

}
