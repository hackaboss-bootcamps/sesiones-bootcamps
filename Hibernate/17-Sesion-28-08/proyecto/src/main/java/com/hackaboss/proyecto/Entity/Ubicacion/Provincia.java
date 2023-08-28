package com.hackaboss.proyecto.Entity.Ubicacion;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import javax.persistence.*;

@Entity
@Table(name = "provincia")
public class Provincia extends Auditoria {
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pais_id", nullable = false)
    private Pais paisId;
}
