package com.Blood_Donation_System.Blood_Donation_System.controller;
import com.Blood_Donation_System.Blood_Donation_System.model.DonorModel;
import com.Blood_Donation_System.Blood_Donation_System.model.PatientModel;
import com.Blood_Donation_System.Blood_Donation_System.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PatientController {
    @Autowired
    private PatientService patientService;



    /* to save a patient */
    @PostMapping("/patient")
    public String createPatient(@ModelAttribute PatientModel patient) {


            System.out.println("Patient request: "+ patient);
            PatientModel registeredPatient=patientService.becomePatient(patient.getPatient_name(), patient.getPatient_mobile(), patient.getPatient_age(),
                    patient.getPatient_gender(), patient.getPatient_bloodgroup(), patient.getPatient_address());
            if (registeredPatient == null) {
                return "error_page";
            }else
                return "home_page";

    }

    /* get all patients */
    @GetMapping("/patient")
    public String getBecomePatientPage(Model model){
        model.addAttribute("PatientRequest", new PatientModel());
        return "patient_page";
    }
    /* Delete a product */



}
