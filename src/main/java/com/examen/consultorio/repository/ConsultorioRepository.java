package com.examen.consultorio.repository;

import com.examen.consultorio.entity.Consultorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultorioRepository extends JpaRepository<Consultorio, Long> {}