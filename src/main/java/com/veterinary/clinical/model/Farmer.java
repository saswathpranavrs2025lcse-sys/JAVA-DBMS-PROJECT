package com.veterinary.clinical.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmers")
public class Farmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String location;
    private String livestockDetails;

    public Farmer() {
    }

    public Farmer(String name, String phone, String location, String livestockDetails) {
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.livestockDetails = livestockDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLivestockDetails() {
        return livestockDetails;
    }

    public void setLivestockDetails(String livestockDetails) {
        this.livestockDetails = livestockDetails;
    }
}
