package com.hackaboss.caso2.Entity;

import javax.persistence.*;

@Entity
@Table(name="provincia")
public class Provincia extends Auditoria{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 50)
    private String nombre;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pais_id", nullable = false)
    private Pais paisId;
}
