package com.example.FacilityBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FacilityBooking.entity.Facility;
import com.example.FacilityBooking.repository.FacilityRepository;

@Service
public class FacilityService {
	
	@Autowired
	private FacilityRepository facilityRepository;
	
	public List<Facility> getAllFacilities(Long id)
	{
		return this.facilityRepository.findByVenueId(id);
	}
	public void addFacility(Facility facility)
	{
		this.facilityRepository.save(facility);
	}
	public List<Facility> getAllFacility() {
		return this.facilityRepository.findAll();
	}

}
