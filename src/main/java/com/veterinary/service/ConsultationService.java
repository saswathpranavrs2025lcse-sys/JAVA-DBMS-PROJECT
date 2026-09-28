package com.veterinary.service;

import com.veterinary.clinical.model.Consultation;
import com.veterinary.repository.ConsultationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {

    private final ConsultationRepository consultationRepository;

    public ConsultationService(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    // Get all consultations
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    // Save consultation
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    // Delete consultation
    public void deleteConsultation(Long id) {
        consultationRepository.deleteById(id);
    }

    // Find by ID
    public Consultation getConsultationById(Long id) {
        return consultationRepository.findById(id).orElse(null);
    }
}
