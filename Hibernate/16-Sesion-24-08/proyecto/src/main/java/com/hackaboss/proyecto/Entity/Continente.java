package com.hackaboss.proyecto.Entity;

import com.hackaboss.proyecto.Entity.Component.Auditoria;
import com.hackaboss.proyecto.Entity.Component.IdentificadorActivo;
import com.hackaboss.proyecto.Entity.Component.IdentificadorId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "continente")
public class Continente extends Auditoria {

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
