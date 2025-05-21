package com._minutes.patient_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

//
//package com.example.patientmanagement.service;

import com._minutes.patient_management.model.ServiceEntity;
import com._minutes.patient_management.repository.ServiceRepository;

@Service
public class HospitalService {
	private final ServiceRepository repo;

	public HospitalService(ServiceRepository repo) {
		this.repo = repo;
	}

	public List<ServiceEntity> getAllServices() {
		return repo.findAll();
	}

	public long countServices() {
		return repo.count();
	}

	public ServiceEntity getServiceById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public ServiceEntity addService(ServiceEntity service) {
		return repo.save(service);
	}
}
