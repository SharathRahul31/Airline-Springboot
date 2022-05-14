package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IItineraryRepository;

import com.faith.app.entity.Itinerary;

@Service
public  class ItineraryServiceImplementation implements IItineraryService {
	
	@Autowired
	 private IItineraryRepository itineraryRepo;
	
	
	

	@Override
	public List<Itinerary> getItinerary() {
		
		return (List<Itinerary>) itineraryRepo.findAll();
	}

	
	/* //Insert or Update
	public void saveItinerary(Itinerary employee) {	
		itineraryRepo.save(employee);

	}

	  //Get Employee By id
	@Override
	public  Optional<Itinerary> getEmployee(int  id) {
		return  itineraryRepo.findById(id);
	}

	 //Delete Employee
	@Override
	public void deleteEmployee(int id) {
		    
		itineraryRepo.deleteById(id);

	}


	@Override
	public List<Itinerary> getEmployeesByEmployeeName(String name) {
		
		return (List<Itinerary>)   itineraryRepo.findByEmployeeName(name);
	}

*/
}
