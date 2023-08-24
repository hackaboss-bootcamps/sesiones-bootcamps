package com.hackaboss.proyecto.Entity.Ubicacion;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Pais extends Auditoria {
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "continente_id", nullable = false)
    private Continente continenteId;
}
