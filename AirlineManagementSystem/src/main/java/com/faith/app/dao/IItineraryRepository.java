	package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.faith.app.entity.Itinerary;


@Repository
public interface IItineraryRepository extends CrudRepository<Itinerary, Integer> {
	
	  
	/* //Custom Methods - JPQL
	@Query ("from Employee where employeeName like %?1%")
	public List <Itinerary> findByEmployeeName (String name);
	
	@Query("SELECT new  com.faith.app.dto.EmployeeDeptDTO(e.id,  e.employeeName, e.designation, d.departmentName) "
			+ "FROM Employee e INNER JOIN e.department d ORDER BY e.id")	
	public List <EmployeeDeptDTO> findAllDTOEmployees ();
	
	
	*/
	
	
//	@Query ("from Employee where designation like %?1%")
//	public List <Employee> findByDesignation (String designation);
//	
//	@Query ("from Employee where designation like %?1% and employeeName like %?2%")
//	public List <Employee> findByNAmeAndDesignation (String designation, String name);

}