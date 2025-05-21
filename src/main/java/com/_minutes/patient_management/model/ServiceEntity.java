package com._minutes.patient_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ServiceEntity {

	@Id
	private Long id;

	private String serviceName;
	private float fees;

	// No-arg constructor
	public ServiceEntity() {
	}

	public ServiceEntity(Long id, String serviceName, float fees) {
		this.id = id;
		this.serviceName = serviceName;
		this.fees = fees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	// Getters and setters
}
