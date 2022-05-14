package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Flights;

public interface IFlightsRepository extends CrudRepository<Flights, Integer> {
	
	
	/* //custom methods
	@Query("FROM Department WHERE departmentName LIKE %?1%")
	public List<Flights> findByName(String name);
*/
}
