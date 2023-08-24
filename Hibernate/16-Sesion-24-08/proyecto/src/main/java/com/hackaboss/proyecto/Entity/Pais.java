package com.hackaboss.proyecto.Entity;

import com.hackaboss.proyecto.Entity.Component.Auditoria;
import com.hackaboss.proyecto.Entity.Component.IdentificadorId;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Pais extends Auditoria {
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "continente_id", nullable = false)
    private Continente continenteId;
}
