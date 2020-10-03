package com.example.FacilityBooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.FacilityBooking.entity.Facility;

public interface FacilityRepository extends JpaRepository<Facility,Long> {
	
//	@Query("Select f.name from Facility f join Venue v")
//	public List<Facility> findByVf(int id);
	

}
