@echo off
title Tele-Veterinary System Launcher
echo Launching Tele-Veterinary Clinical Diagnostics System on http://localhost:8084 ...
start "" http://localhost:8084/
mvn spring-boot:run
pause
