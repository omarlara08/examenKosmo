package com.examen.consultorio.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Consultorio consultorio;

    @ManyToOne
    private Doctor doctor;

    private LocalDateTime horario;
    private String nombrePaciente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
}
