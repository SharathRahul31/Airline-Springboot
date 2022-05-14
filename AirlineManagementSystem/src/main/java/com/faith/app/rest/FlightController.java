package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Flights;
import com.faith.app.service.IFlightsSevice;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FlightController {
	
	@Autowired
	 private IFlightsSevice flightService;
	 
	 
	 //Get all Employees
	 @GetMapping("/flights")
	 public List<Flights> getAllDepartment(){
		 
		 return flightService.getFlights();
	 }
	 

}
