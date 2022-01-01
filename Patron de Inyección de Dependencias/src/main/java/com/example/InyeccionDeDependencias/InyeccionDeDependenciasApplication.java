package com.example.InyeccionDeDependencias;

import com.example.InyeccionDeDependencias.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InyeccionDeDependenciasApplication implements CommandLineRunner {

    private IPersonaService iPersonaService;

    @Autowired
    public InyeccionDeDependenciasApplication(IPersonaService iPersonaService) {
        this.iPersonaService = iPersonaService;
    }

    public static void main(String[] args) {
        SpringApplication.run(InyeccionDeDependenciasApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        iPersonaService.registrar("Luciano");
    }

}
