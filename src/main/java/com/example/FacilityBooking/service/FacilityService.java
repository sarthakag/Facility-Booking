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
	
//	public List<Facility> getFacilities(int id)
//	{
//		return this.facilityRepository.findByVf(id);
//	}
	public List<Facility> getAll()
	{
		return this.facilityRepository.findAll();
	}

}
