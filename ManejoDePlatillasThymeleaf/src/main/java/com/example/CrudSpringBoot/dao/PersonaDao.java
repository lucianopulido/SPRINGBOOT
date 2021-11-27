package com.example.CrudSpringBoot.dao;

import com.example.CrudSpringBoot.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
