package com.hackaboss.caso3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="ciudad")
public class Ciudad extends Generica{
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "provincia_id", nullable = false)
    private Provincia provinciaId;
}
