package com.example.FacilityBooking.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="Facility")
public class Facility {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;
//	
//	@OneToMany(targetEntity=Slot.class, cascade= CascadeType.ALL)	
//	@JoinColumn(name="fs",referencedColumnName="id")
//	private List<Slot> bookedSlots;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
