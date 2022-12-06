package com.tpi.crud.entity;

import lombok.Data;

import javax.persistence.*;
@MappedSuperclass
@Data
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String direccion;
    private String telefono;
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;



}
