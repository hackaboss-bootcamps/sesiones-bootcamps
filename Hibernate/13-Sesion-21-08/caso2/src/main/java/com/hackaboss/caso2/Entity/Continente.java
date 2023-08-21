package com.hackaboss.caso2.Entity;

import javax.persistence.*;

@Entity
@Table(name="continente")
public class Continente extends Auditoria{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50)
    private String nombre;
}
