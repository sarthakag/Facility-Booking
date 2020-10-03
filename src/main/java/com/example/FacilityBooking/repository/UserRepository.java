package com.example.FacilityBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacilityBooking.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
