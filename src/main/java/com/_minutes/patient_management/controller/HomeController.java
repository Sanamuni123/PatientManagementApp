package com._minutes.patient_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com._minutes.patient_management.service.HospitalService;
import com._minutes.patient_management.service.PatientService;

@Controller
public class HomeController {

	private final PatientService patientService;
	private final HospitalService hospitalService;

	public HomeController(PatientService patientService, HospitalService hospitalService) {
		this.patientService = patientService;
		this.hospitalService = hospitalService;
	}

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/patients")
	public String getAllPatients(Model model) {
		model.addAttribute("patients", patientService.getAllPatients());
		return "patients";
	}

	@GetMapping("/services")
	public String getAllServices(Model model) {
		model.addAttribute("services", hospitalService.getAllServices());
		return "services";
	}
}