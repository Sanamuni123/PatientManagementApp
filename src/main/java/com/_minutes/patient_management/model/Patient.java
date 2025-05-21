package com._minutes.patient_management.model;
//package com.example.patientmanagement.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {

	@Id
	private Long id;

	private String firstName;
	private String lastName;

	// No-argument constructor (required by JPA)
	public Patient() {
	}

	// Optional: constructor for convenience
	public Patient(Long id, String firstName, String lastName, List<ServiceEntity> list) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Getters and setters
}