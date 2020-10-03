package com.example.FacilityBooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.FacilityBooking.entity.Venue;

public interface VenueRepository extends JpaRepository<Venue,Long>{	

}
