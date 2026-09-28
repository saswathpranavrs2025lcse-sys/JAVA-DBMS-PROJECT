package com.veterinary.service;

import com.veterinary.clinical.model.Veterinarian;
import com.veterinary.repository.VeterinarianRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarianService {

    private final VeterinarianRepository veterinarianRepository;

    public VeterinarianService(VeterinarianRepository veterinarianRepository) {
        this.veterinarianRepository = veterinarianRepository;
    }

    public List<Veterinarian> getAllVeterinarians() {
        return veterinarianRepository.findAll();
    }

    public Veterinarian saveVeterinarian(Veterinarian veterinarian) {
        return veterinarianRepository.save(veterinarian);
    }

    public void deleteVeterinarian(Long id) {
        veterinarianRepository.deleteById(id);
    }

    public Veterinarian getVeterinarianById(Long id) {
        return veterinarianRepository.findById(id).orElse(null);
    }
}
