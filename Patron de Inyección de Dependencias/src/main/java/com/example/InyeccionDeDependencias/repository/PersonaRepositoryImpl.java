package com.example.InyeccionDeDependencias.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepositoryImpl implements IPersonaRepository {

    @Override
    public void registrar(String nombre) {
        System.out.println("Estoy en el metodo registrar del PersonaRepository");
        System.out.println("Su nombre es: "+nombre);
    }

}
