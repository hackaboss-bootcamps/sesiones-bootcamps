package com.hackaboss.caso3.Entity;

import jakarta.persistence.*;
@Entity
@Table(name="pais")
public class Pais extends Generica{
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "continente_id", nullable = false)
    private Continente continenteId;
}
