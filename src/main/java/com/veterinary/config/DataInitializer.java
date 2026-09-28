package com.veterinary.config;

import com.veterinary.clinical.model.Consultation;
import com.veterinary.clinical.model.Farmer;
import com.veterinary.clinical.model.Veterinarian;
import com.veterinary.repository.ConsultationRepository;
import com.veterinary.repository.FarmerRepository;
import com.veterinary.repository.VeterinarianRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    private final FarmerRepository farmerRepository;
    private final VeterinarianRepository veterinarianRepository;
    private final ConsultationRepository consultationRepository;

    public DataInitializer(FarmerRepository farmerRepository,
                           VeterinarianRepository veterinarianRepository,
                           ConsultationRepository consultationRepository) {
        this.farmerRepository = farmerRepository;
        this.veterinarianRepository = veterinarianRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public void run(String... args) {
        if (farmerRepository.count() == 0) {
            farmerRepository.save(new Farmer("Ramesh Kumar", "+91 9876543210", "Coimbatore Rural, TN", "5 Dairy Cows, 12 Goats"));
            farmerRepository.save(new Farmer("Murugan Vel", "+91 9845123456", "Pollachi Outskirts, TN", "8 Sheep, 2 Working Bulls"));
            farmerRepository.save(new Farmer("Kavitha Selvam", "+91 9443218765", "Tirupur North, TN", "3 Jersey Cows, 15 Country Chickens"));
        }

        if (veterinarianRepository.count() == 0) {
            veterinarianRepository.save(new Veterinarian("Dr. PD Mahendhiran", "Large Animal Medicine & Surgery", "+91 9894011223", "mahendhiran@sece.ac.in", "09:00 AM - 05:00 PM"));
            veterinarianRepository.save(new Veterinarian("Dr. Ananya Sharma", "Bovine Infectious Diseases & Diagnostics", "+91 9786022334", "ananya.vet@livestock.org", "10:00 AM - 04:00 PM"));
            veterinarianRepository.save(new Veterinarian("Dr. Rajesh Natarajan", "Ruminant Nutrition & Pharmacology", "+91 9654033445", "rajesh.vet@clinical.in", "08:30 AM - 02:30 PM"));
        }

        if (consultationRepository.count() == 0) {
            consultationRepository.save(new Consultation(
                    1L,
                    "Dr. PD Mahendhiran",
                    LocalDate.now().toString(),
                    "High fever (104.2 F), reduced milk yield, nasal discharge",
                    "Early Stage Bovine Respiratory Disease",
                    "Nasal swab PCR and hematology panel",
                    "Ceftiofur sodium 2.2mg/kg IM, Meloxicam 0.5mg/kg",
                    "Completed"
            ));

            consultationRepository.save(new Consultation(
                    2L,
                    "Dr. Ananya Sharma",
                    LocalDate.now().plusDays(1).toString(),
                    "Swollen left hind hoof, reluctance to walk",
                    "Interdigital Necrobacillosis (Foot Rot)",
                    "Visual lesion inspection & bacterial culture",
                    "Oxytetracycline topical spray + Procaine penicillin G",
                    "Scheduled"
            ));

            consultationRepository.save(new Consultation(
                    3L,
                    "Dr. Rajesh Natarajan",
                    LocalDate.now().minusDays(2).toString(),
                    "Anorexia, lethargy, decreased rumen motility",
                    "Subacute Ruminal Acidosis (SARA)",
                    "Rumen fluid pH test",
                    "Sodium bicarbonate oral drench, probiotic yeast culture",
                    "Pending"
            ));
        }
    }
}
