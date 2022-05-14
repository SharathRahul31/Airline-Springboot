package com.faith.app.entity;


import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itinerary")
public class Itinerary {
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "itineraryid")
	  private Integer itineraryId;
	  
	 @Column(name = "depairport",nullable = false,length = 40)
	  private String depAirport;
	  
	 @Column(name = "depdate",nullable = false,length = 40)
	  private LocalDate depDate;
	  
	 @Column(name = "deptime")
	  private String depTime;
	 
	 @Column(name = "arrairport",nullable = false,length = 40)
	  private String arrAirport;
	  
	 @Column(name = "arrdate",nullable = false,length = 40)
	  private LocalDate arrDate;
	  
	 @Column(name = "arrtime")
	  private String arrTime;
	 
	 
	
	  
	 
	 @ManyToOne
	 @JoinColumn(name = "flightid" , insertable = false, updatable = false)
	 
	  private Flights flights;

	  
	  
	public Itinerary() {
		super();
		
	}

	
	public Itinerary(Integer itineraryId, String depAirport, LocalDate depDate, String depTime, String arrAirport,
			LocalDate arrDate, String arrTime, Integer flightId, Flights flights) {
		super();
		this.itineraryId = itineraryId;
		this.depAirport = depAirport;
		this.depDate = depDate;
		this.depTime = depTime;
		this.arrAirport = arrAirport;
		this.arrDate = arrDate;
		this.arrTime = arrTime;
		this.flights = flights;
	}


	public Integer getItineraryId() {
		return itineraryId;
	}


	public void setItineraryId(Integer itineraryId) {
		this.itineraryId = itineraryId;
	}


	public String getDepAirport() {
		return depAirport;
	}


	public void setDepAirport(String depAirport) {
		this.depAirport = depAirport;
	}


	public LocalDate getDepDate() {
		return depDate;
	}


	public void setDepDate(LocalDate depDate) {
		this.depDate = depDate;
	}


	public String getDepTime() {
		return depTime;
	}


	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}


	public String getArrAirport() {
		return arrAirport;
	}


	public void setArrAirport(String arrAirport) {
		this.arrAirport = arrAirport;
	}


	public LocalDate getArrDate() {
		return arrDate;
	}


	public void setArrDate(LocalDate arrDate) {
		this.arrDate = arrDate;
	}


	public String getArrTime() {
		return arrTime;
	}


	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}




	public Flights getFlights() {
		return flights;
	}


	public void setFlights(Flights flights) {
		this.flights = flights;
	}


	@Override
	public String toString() {
		return "Itinerary [itineraryId=" + itineraryId + ", depAirport=" + depAirport + ", depDate=" + depDate
				+ ", depTime=" + depTime + ", arrAirport=" + arrAirport + ", arrDate=" + arrDate + ", arrTime="
				+ arrTime + ",  flights=" + flights + "]";
	}


	

}

