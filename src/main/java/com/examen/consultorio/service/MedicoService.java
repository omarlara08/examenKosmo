package com.examen.consultorio.service;

import com.examen.consultorio.entity.Cita;

public interface MedicoService {

    public Cita guardarCita(Cita cita);

    Object obtenerTodas();
}