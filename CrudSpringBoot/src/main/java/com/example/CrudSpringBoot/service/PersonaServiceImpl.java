package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.dao.PersonaDao;
import com.example.CrudSpringBoot.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Transactional(readOnly = true)
    @Override
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Transactional
    @Override
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Transactional
    @Override
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Transactional(readOnly = true)
    @Override
    public Persona encontrarPersona(Persona persona) {
        return personaDao.findById(persona.getId()).orElse(null);
    }

}
