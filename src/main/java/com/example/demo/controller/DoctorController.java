package com.example.demo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.repository.DoctorRepository;

@Controller
public class DoctorController {
    @Autowired
    private DoctorRepository DoctorRepository;
    private patientRepository patientRepository;

    @GetMapping("/Doctors")
    public String listDoctors(Model model) {
        model.addAttribute("Doctors", DoctorRepository.findAll());
        return "Doctor/list";
    }
    
    @GetMapping("/addPatient")
    public String addPatient(@ModelAttribute Patient patient) {
        patientRepository.save(patient);
        return "redirect:/";
    }

    @GetMapping("/updatePatient/{id}")
    public String updatePatient(@ModelAttribute Patient patient) {
        Doctor Doctor = DoctorRepository.findById(id).orElse(null);
        model.addAttribute("Doctor", Doctor);
        model.addAttribute("patients", patientRepository.findAll());
        patientRepository.save(patient);
        return "updatePatient";
    }

    @GetMapping("/deletePatient/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientRepository.deleteById(id);
        return "redirect:/";
    }
}