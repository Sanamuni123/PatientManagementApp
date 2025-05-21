package com._minutes.patient_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

//package com.example.patientmanagement.service;

import com._minutes.patient_management.model.Patient;
import com._minutes.patient_management.repository.PatientRepository;

@Service
public class PatientService {
	private final PatientRepository repo;

	public PatientService(PatientRepository repo) {
		this.repo = repo;
	}

	public List<Patient> getAllPatients() {
		return repo.findAll();
	}

	public long countPatients() {
		return repo.count();
	}

	public Patient getPatientById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public Patient addPatient(Patient patient) {
		return repo.save(patient);
	}
}
