package com.example.FacilityBooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacilityBooking.entity.Facility;

public interface FacilityRepository extends JpaRepository<Facility,Long> {
	
	public List<Facility> findByVf();
	

}
