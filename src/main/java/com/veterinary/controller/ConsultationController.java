package com.veterinary.controller;

import com.veterinary.clinical.model.Consultation;
import com.veterinary.service.ConsultationService;
import com.veterinary.service.FarmerService;
import com.veterinary.service.VeterinarianService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConsultationController {

    private final ConsultationService consultationService;
    private final FarmerService farmerService;
    private final VeterinarianService veterinarianService;

    public ConsultationController(ConsultationService consultationService,
                                  FarmerService farmerService,
                                  VeterinarianService veterinarianService) {
        this.consultationService = consultationService;
        this.farmerService = farmerService;
        this.veterinarianService = veterinarianService;
    }

    // Display consultation page
    @GetMapping("/consultations")
    public String showConsultationPage(Model model) {
        model.addAttribute("consultation", new Consultation());
        model.addAttribute("consultations", consultationService.getAllConsultations());
        model.addAttribute("farmers", farmerService.getAllFarmers());
        model.addAttribute("veterinarians", veterinarianService.getAllVeterinarians());
        return "consultations";
    }

    // Save consultation
    @PostMapping("/consultations")
    public String addConsultation(@ModelAttribute Consultation consultation) {
        consultationService.saveConsultation(consultation);
        return "redirect:/consultations";
    }

    // Delete consultation
    @GetMapping("/consultations/delete/{id}")
    public String deleteConsultation(@PathVariable Long id) {
        consultationService.deleteConsultation(id);
        return "redirect:/consultations";
    }
}
