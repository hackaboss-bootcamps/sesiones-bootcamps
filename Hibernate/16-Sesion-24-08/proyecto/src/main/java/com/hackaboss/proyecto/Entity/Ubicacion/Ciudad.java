package com.hackaboss.proyecto.Entity.Ubicacion;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import javax.persistence.*;

@Entity
@Table(name = "ciudad")
public class Ciudad extends Auditoria {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "provincia_id", nullable = false)
    private Provincia provinciaId;
}
