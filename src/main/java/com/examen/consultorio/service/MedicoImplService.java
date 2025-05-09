package com.examen.consultorio.service;

import com.examen.consultorio.entity.Cita;
import com.examen.consultorio.repository.CitaRepository;
import com.examen.consultorio.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MedicoImplService  implements  MedicoService{
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private CitaRepository citaRepository;

    public boolean validarNuevaCita(Cita nuevaCita) {
        LocalDateTime horario = nuevaCita.getHorario();
        long citasDelDia = doctorRepository.countByDoctorAndFecha(nuevaCita.getDoctor(), horario.toLocalDate());
        if (citasDelDia >= 8) {
            return false;
        }

        return true;
    }

    @Override
    public Cita guardarCita(Cita cita) {
        if (validarNuevaCita(cita)) {
            return citaRepository.save(cita);
        }
        throw new RuntimeException("No se puede registrar la cita.");
    }

    @Override
    public List<Cita> obtenerTodas() {
        return citaRepository.findAll();
    }
}
