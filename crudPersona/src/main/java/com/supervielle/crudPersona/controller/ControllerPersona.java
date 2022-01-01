package com.supervielle.crudPersona.controller;

import com.supervielle.crudPersona.model.Persona;
import com.supervielle.crudPersona.service.PersonaService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@Slf4j
public class ControllerPersona {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/guardar")
    public String guardarPersona(Persona persona) {
        personaService.guardarPersona(persona);
        return "redirect:/";
    }

    @GetMapping("/eliminar")
    public String eliminarPersona(Persona persona) {
        personaService.eliminarPersona(persona);
        return "redirect:/";
    }

    @GetMapping("/listar")
    public String listarPersonas() {
        List<Persona> personas = personaService.listarPersonas();
        return "redirect:/";
    }

    @GetMapping("/buscar")
    public String buscarPersona(Persona persona) {
        Persona personaBuscada = personaService.buscarPersona(persona);
        return "redirect:/";
    }

    @PutMapping("/actualizar")
    public String actualizarPersona(Persona persona) {
        Persona personaActualizada = personaService.buscarPersona(persona);
        personaService.guardarPersona(personaActualizada);
        return "redirect:/";
    }
}
