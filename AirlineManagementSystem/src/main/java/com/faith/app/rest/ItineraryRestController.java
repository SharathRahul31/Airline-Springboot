package com.faith.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Itinerary;
import com.faith.app.service.IItineraryService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ItineraryRestController {
	
	@Autowired
	private IItineraryService  itineraryService;
	
	
	//Get All  Employee
	@GetMapping("/itinerary")
	public List<Itinerary> getAllEmployees() {
		
		  return itineraryService.getItinerary();
	}
	
	
	/*
  //Get  Employee By Id
	@GetMapping("/employees/{id}")
	public Optional<Itinerary> getEmployee(@PathVariable int id){
		
		return employeeService.getEmployee(id);
	}
	
	
	//Add  Employee
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Itinerary employee) {
		 
		employeeService.saveEmployee(employee);
	}
	
	
	//Update  Employee
	@PutMapping("/employees")
	public void updateEmployee(@RequestBody Itinerary employee) {
		
		 employeeService.saveEmployee(employee);
	}
	
	
	//Delete  Employee
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee( @PathVariable int id) {
		
		employeeService.deleteEmployee(id);
	}
	
	
	//Custom Methods Using JPQL
	@GetMapping("/employees/search/{name}")
	public List<Itinerary>  getAllEmployeesByName(@PathVariable String name) {
		return employeeService.getEmployeesByEmployeeName(name);
		
	}
	
	
	//Custom Methods Using JPQL - DTO --InnerJoin
	@GetMapping("/employees/dto")
	public List<EmployeeDeptDTO>  getAllDTOEmployees() {
		
		return employeeService.getAllDTOEmployees();
	}
	*/
	}


