package com.tpi.crud.entity;

import lombok.Data;
import org.hibernate.tool.schema.internal.exec.GenerationTarget;

import javax.persistence.*;

@Entity
@Data
public class Contacto  extends Persona {

    @Column(name = "telefono_casa")
    private String telefonoCasa;
    @Column(name = "otro_telefono")
    private String OtroTelefono;
    private String correo;


}
