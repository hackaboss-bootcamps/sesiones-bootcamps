package com.hackaboss.proyecto.Entity;

import com.hackaboss.proyecto.Entity.Component.Auditoria;
import com.hackaboss.proyecto.Entity.Component.IdentificadorId;

import javax.persistence.*;

@Entity
@Table(name = "provincia")
public class Provincia extends Auditoria {
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pais_id", nullable = false)
    private Pais paisId;
}
