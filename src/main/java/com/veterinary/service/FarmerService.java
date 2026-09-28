package com.veterinary.service;

import com.veterinary.clinical.model.Farmer;
import com.veterinary.repository.FarmerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {

    private final FarmerRepository farmerRepository;

    public FarmerService(FarmerRepository farmerRepository) {
        this.farmerRepository = farmerRepository;
    }

    public Farmer saveFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    public void deleteFarmer(Long id) {
        farmerRepository.deleteById(id);
    }

    public Farmer getFarmerById(Long id) {
        return farmerRepository.findById(id).orElse(null);
    }
}
