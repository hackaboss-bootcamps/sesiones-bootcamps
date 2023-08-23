package com.hackaboss.caso3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="continente")
public class Continente extends Generica{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    @Column(name = "nombre", length = 100) // Cambiar las propiedades del Column
    public String getNombre() {
        return super.getNombre();
    }
}
