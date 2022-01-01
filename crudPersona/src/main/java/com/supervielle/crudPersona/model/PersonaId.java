package com.supervielle.crudPersona.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class PersonaId implements Serializable {

    @Column(name = "tipoDocumento")
    private String tipoDocumento;

    @Column(name = "nroDocumento")
    private int nroDocumento;

    @Column(name = "pais")
    private String pais;

    @Column(name = "sexo")
    private String sexo;
}
