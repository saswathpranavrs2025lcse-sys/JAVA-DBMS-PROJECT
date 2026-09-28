package com.veterinary.clinical.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultations")
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long farmerId;
    private String veterinarianName;
    private String consultationDate;
    private String symptoms;
    private String diagnosis;
    private String diagnosticTest;
    private String prescription;
    private String status;

    public Consultation() {
    }

    public Consultation(Long farmerId, String veterinarianName, String consultationDate, 
                        String symptoms, String diagnosis, String diagnosticTest, 
                        String prescription, String status) {
        this.farmerId = farmerId;
        this.veterinarianName = veterinarianName;
        this.consultationDate = consultationDate;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
        this.diagnosticTest = diagnosticTest;
        this.prescription = prescription;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(Long farmerId) {
        this.farmerId = farmerId;
    }

    public String getVeterinarianName() {
        return veterinarianName;
    }

    public void setVeterinarianName(String veterinarianName) {
        this.veterinarianName = veterinarianName;
    }

    public String getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(String consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosticTest() {
        return diagnosticTest;
    }

    public void setDiagnosticTest(String diagnosticTest) {
        this.diagnosticTest = diagnosticTest;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
