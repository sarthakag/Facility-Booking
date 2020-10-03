package com.example.FacilityBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.FacilityBooking.entity.Facility;
import com.example.FacilityBooking.entity.Venue;
import com.example.FacilityBooking.service.FacilityService;

@RestController

public class FacilityController {
	@Autowired
	private FacilityService facilityService;
	
	@RequestMapping("/venues/{id}/facilities")
	public List<Facility> getAllFacilities(@PathVariable Long id)
	{
		return facilityService.getAllFacilities(id);
	}
	
	@RequestMapping("/facilities")
	public List<Facility> getFacility()
	{
		return facilityService.getAllFacility();
	}
	@RequestMapping(method=RequestMethod.POST, value="/venues/{VenueId}/facilities")
	public String addFacility(@RequestBody Facility facility, @PathVariable Long VenueId)
	{
		facility.setVenueId(VenueId);
		facilityService.addFacility(facility);
		String response = "{\"success\": true, \"message\": Facility has been added successfully.}";
		return response;
	}
	
//	@RequestMapping(method=RequestMethod.POST, value="/venues")
//	public String addFacility(@RequestBody Venue venue) {
//		facilityService.addFacility(venue);
//		String response = "{\"success\": true, \"message\": Facility has been added successfully.}";
//		return response;
//	}
//	public List<Facility> getAllFacility
}
