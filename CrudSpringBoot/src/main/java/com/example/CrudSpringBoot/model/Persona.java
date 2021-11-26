package com.example.CrudSpringBoot.model;

import javax.persistence.*;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
