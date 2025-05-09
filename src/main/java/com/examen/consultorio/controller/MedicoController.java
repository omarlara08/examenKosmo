package com.examen.consultorio.controller;

import com.examen.consultorio.entity.Cita;
import com.examen.consultorio.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citas")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public String filtrar(Model model) {
        model.addAttribute("citas", medicoService.obtenerTodas());
        return "citas/listar";
    }

    @PostMapping("/nueva")
    public String crearCita(@ModelAttribute Cita cita) {
        medicoService.guardarCita(cita);
        return "redirect:/citas";
    }

}
