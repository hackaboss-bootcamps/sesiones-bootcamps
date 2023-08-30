package com.hackaboss.proyecto.Entity.Ubicacion;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Pais extends Auditoria {

    @Column(name="nombre",length = 50, nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "continente_id", nullable = false)
    private Continente continenteId;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Continente getContinenteId() {
        return continenteId;
    }

    public void setContinenteId(Continente continenteId) {
        this.continenteId = continenteId;
    }
}
