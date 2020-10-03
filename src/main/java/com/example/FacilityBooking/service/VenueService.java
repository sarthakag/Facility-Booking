package com.example.FacilityBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FacilityBooking.entity.Facility;
import com.example.FacilityBooking.entity.User;
import com.example.FacilityBooking.entity.Venue;
import com.example.FacilityBooking.repository.VenueRepository;

@Service
public class VenueService {
	
	@Autowired
	private VenueRepository venueRepository;
	
	public List<Venue> getAllVenues()
	{
		return (List<Venue>) this.venueRepository.findAll();
	}
	public void addVenue(Venue venue)
	{
		this.venueRepository.save(venue);
	}
}
