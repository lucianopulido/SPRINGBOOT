package com.supervielle.crudPersona.service;

import com.supervielle.crudPersona.model.Persona;
import java.util.List;

public interface PersonaService {

    public void guardarPersona(Persona persona);

    public Persona buscarPersona(Persona persona);

    public List<Persona> listarPersonas();

    public void eliminarPersona(Persona persona);

}
