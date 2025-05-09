package com.examen.consultorio.repository;

import com.examen.consultorio.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {


    long countByDoctorAndFecha(Doctor doctor, LocalDate localDate);
}