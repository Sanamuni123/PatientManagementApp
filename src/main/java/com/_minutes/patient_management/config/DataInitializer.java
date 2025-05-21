package com._minutes.patient_management.config;

import java.util.Arrays;

import org.springframework.stereotype.Component;

//package com.example.patientmanagement.config;

import com._minutes.patient_management.model.Patient;
import com._minutes.patient_management.model.ServiceEntity;
import com._minutes.patient_management.repository.PatientRepository;
import com._minutes.patient_management.repository.ServiceRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DataInitializer {

	private final PatientRepository patientRepo;
	private final ServiceRepository serviceRepo;

	public DataInitializer(PatientRepository patientRepo, ServiceRepository serviceRepo) {
		this.patientRepo = patientRepo;
		this.serviceRepo = serviceRepo;
	}

	@PostConstruct
	public void init() {
		ServiceEntity s1 = new ServiceEntity(1L, "OPD", 500f);
		ServiceEntity s2 = new ServiceEntity(2L, "X-ray", 1000f);
		ServiceEntity s3 = new ServiceEntity(3L, "ECG", 2200f);
		serviceRepo.saveAll(Arrays.asList(s1, s2, s3));

		Patient p1 = new Patient(1L, "Muni", "Kumar", Arrays.asList(s1));
		Patient p2 = new Patient(2L, "David", "Howlett", Arrays.asList(s2, s3));
		Patient p3 = new Patient(3L, "Simon", "Morphy", Arrays.asList(s3));
		patientRepo.saveAll(Arrays.asList(p1, p2, p3));
	}
}
