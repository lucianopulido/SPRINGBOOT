package com.example.InyeccionDeDependencias.service;

import com.example.InyeccionDeDependencias.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaRepository iPersonaRepository;

    
    @Override
    public void registrar(String nombre) {
        System.out.println("Estoy en el metodo registrar del PersonaService");
        iPersonaRepository.registrar(nombre);
    }

}
