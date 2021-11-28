package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.model.Persona;
import java.util.List;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

}
