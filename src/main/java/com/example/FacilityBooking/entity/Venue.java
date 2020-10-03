package com.example.FacilityBooking.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="Venue")
public class Venue {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;
	
//	@OneToMany(targetEntity=Facility.class, cascade= CascadeType.ALL)	
//	@JoinColumn(name="VenueId",referencedColumnName="id")
//	private List<Facility> facilities;

	public Venue(Long venueId, String name)
	{
		this.id = venueId;
		this.name = name;
	}
	public Venue()
	{
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
