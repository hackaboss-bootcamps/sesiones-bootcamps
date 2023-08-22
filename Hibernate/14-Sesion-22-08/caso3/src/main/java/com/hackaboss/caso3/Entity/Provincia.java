package com.hackaboss.caso3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="provincia")
public class Provincia extends Generica{
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pais_id", nullable = false)
    private Pais paisId;
}
