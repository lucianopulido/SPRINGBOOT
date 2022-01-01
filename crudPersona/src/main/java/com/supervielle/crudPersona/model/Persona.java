package com.supervielle.crudPersona.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @EmbeddedId
    private PersonaId personaID;

    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private int telefono;
}
