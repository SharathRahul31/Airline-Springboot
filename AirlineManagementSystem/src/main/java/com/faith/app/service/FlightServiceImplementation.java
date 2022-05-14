package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IFlightsRepository;
import com.faith.app.entity.Flights;

@Service
public class FlightServiceImplementation implements IFlightsSevice {
	
	@Autowired
	private IFlightsRepository FlightRepo;

	@Override
	public List<Flights> getFlights() {
		return (List<Flights>) FlightRepo.findAll();
	}

}
