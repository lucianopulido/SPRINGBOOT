package com.example.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;
    
    
    @GetMapping("/")
    public String inicio(Model model){
        String mensaje = "Mensaje con Thymeleaf";
        
        Persona persona = new Persona();
        persona.setNombre("Luciano");
        persona.setApellido("Pulido");
        persona.setEmail("emaildeluciano@gmail.com");
        persona.setTelefono("1155447788");
        
        Persona persona2 = new Persona();
        persona2.setNombre("Jorge");
        persona2.setApellido("Perez");
        persona2.setEmail("emaildejorge@gmail.com");
        persona2.setTelefono("1155447799");
        
        ArrayList personas = new ArrayList();
        personas.add(persona);
        personas.add(persona2);
        
        log.info("Ejecutando el controlador spring MVC");
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo",saludo);
      //  model.addAttribute("persona",persona);
        model.addAttribute("personas",personas);
        return "index";
    }
}
