package com.hackaboss.proyecto.Entity.Seguridad;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona extends Auditoria {

    @Column(name = "primer_nombre",length = 50, nullable = false)
    private String primerNombre;
}
