package com.veterinary.controller;

import com.veterinary.clinical.model.Farmer;
import com.veterinary.service.FarmerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FarmerController {

    private final FarmerService farmerService;

    public FarmerController(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    // Display Farmer page
    @GetMapping("/farmers")
    public String showFarmers(Model model) {
        model.addAttribute("farmer", new Farmer());
        model.addAttribute("farmers", farmerService.getAllFarmers());
        return "farmers";
    }

    // Save Farmer
    @PostMapping("/farmers/save")
    public String saveFarmer(@ModelAttribute Farmer farmer) {
        farmerService.saveFarmer(farmer);
        return "redirect:/farmers";
    }

    // Delete Farmer
    @GetMapping("/farmers/delete/{id}")
    public String deleteFarmer(@PathVariable Long id) {
        farmerService.deleteFarmer(id);
        return "redirect:/farmers";
    }
}
