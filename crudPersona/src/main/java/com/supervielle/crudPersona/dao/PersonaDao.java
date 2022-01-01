package com.supervielle.crudPersona.dao;

import com.supervielle.crudPersona.model.Persona;
import com.supervielle.crudPersona.model.PersonaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, PersonaId> {

}
