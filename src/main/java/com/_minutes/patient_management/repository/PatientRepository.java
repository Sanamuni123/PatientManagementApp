package com._minutes.patient_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//package com.example.patientmanagement.repository;

import com._minutes.patient_management.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

