# Tele-Veterinary Clinical Diagnostics & Remote Livestock Healthcare System

**Java Spring Boot Project - November 2026**  
**Department of Computer Science and Business System**  
**Sri Eshwar College of Engineering** (Affiliated to Anna University)  
**Submitted by:** NANDHANA DHARANI D - 722825244032  
**Under the Guidance of:** Dr. PD Mahendhiran, ASP / CSE(AI&ML)

---

## 📋 Project Overview
The **Tele-Veterinary Clinical Diagnostics System** is a web-based platform designed to provide efficient and accessible veterinary healthcare services to farmers, especially those in rural and remote areas. The system helps farmers connect with veterinarians without requiring frequent physical visits to veterinary clinics.

---

## 🛠️ Technology Stack
- **Backend:** Java 17+, Spring Boot 3.3.4, Spring Data JPA
- **Frontend:** Thymeleaf, HTML5, CSS3, JavaScript
- **Database:** MySQL / H2 Relational Database Engine
- **Build Tool:** Apache Maven
- **Port:** `8084`

---

## 🚀 How to Run the Application

### Option 1: Double-click Launcher
Simply double click `run.bat` or `start.bat` in this folder.

### Option 2: Command Line
```bash
mvn spring-boot:run
```

Once running, open your browser and navigate to:
👉 **[http://localhost:8084](http://localhost:8084)**

---

## 🌐 Application Web Pages & URLs

| Page | URL | Description |
|---|---|---|
| **Home Dashboard** | `http://localhost:8084/` or `http://localhost:8084/home` | Central dashboard with system navigation |
| **Farmer Registration** | `http://localhost:8084/farmers` | Register farmers, view directory, and delete |
| **Veterinarians** | `http://localhost:8084/veterinarians` | Register specialists, list veterinarians |
| **Consultations** | `http://localhost:8084/consultations` | Schedule and log consultations, track status |
| **Database Console** | `http://localhost:8084/h2-console` | Direct database inspector |

---

## 🗄️ Database Profiles
- **Default profile:** Runs out-of-the-box with zero configuration using embedded file persistence (`./data/clinical_db`).
- **MySQL profile:** To connect to a local MySQL server with credentials specified in the report (`navinya15`), run:
  ```bash
  mvn spring-boot:run -Dspring-boot.run.profiles=mysql
  ```
