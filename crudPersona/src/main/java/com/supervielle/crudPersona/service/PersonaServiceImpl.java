package com.supervielle.crudPersona.service;

import com.supervielle.crudPersona.dao.PersonaDao;
import com.supervielle.crudPersona.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Transactional
    @Override
    public void guardarPersona(Persona persona) {
        personaDao.save(persona);
    }

    @Transactional(readOnly = true)
    @Override
    public Persona buscarPersona(Persona persona) {
        return personaDao.findById(persona.getPersonaID()).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAll();
    }

    @Transactional
    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.delete(persona);
    }

}
