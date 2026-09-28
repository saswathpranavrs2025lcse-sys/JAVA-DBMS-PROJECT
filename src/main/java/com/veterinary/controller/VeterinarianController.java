package com.veterinary.controller;

import com.veterinary.clinical.model.Veterinarian;
import com.veterinary.service.VeterinarianService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VeterinarianController {

    private final VeterinarianService veterinarianService;

    public VeterinarianController(VeterinarianService veterinarianService) {
        this.veterinarianService = veterinarianService;
    }

    @GetMapping("/veterinarians")
    public String showVeterinarianPage(Model model) {
        model.addAttribute("veterinarian", new Veterinarian());
        model.addAttribute("veterinarians", veterinarianService.getAllVeterinarians());
        return "veterinarians";
    }

    @PostMapping("/veterinarians")
    public String addVeterinarian(@ModelAttribute Veterinarian veterinarian) {
        veterinarianService.saveVeterinarian(veterinarian);
        return "redirect:/veterinarians";
    }

    @GetMapping("/veterinarians/delete/{id}")
    public String deleteVeterinarian(@PathVariable Long id) {
        veterinarianService.deleteVeterinarian(id);
        return "redirect:/veterinarians";
    }
}
