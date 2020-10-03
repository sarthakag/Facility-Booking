package com.example.FacilityBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.FacilityBooking.entity.Venue;
import com.example.FacilityBooking.service.VenueService;

@RestController
public class VenueController {
	
	@Autowired
	private VenueService venueService;
	@RequestMapping("/venues")
	public List<Venue> getAllVenues()
	{
		return venueService.getAllVenues();
	}
	@RequestMapping(method=RequestMethod.POST, value="/venues")
	public String addVenue(@RequestBody Venue venue) {
		venueService.addVenue(venue);
		String response = "{\"success\": true, \"message\": Venue has been added successfully.}";
		return response;
	}

}
