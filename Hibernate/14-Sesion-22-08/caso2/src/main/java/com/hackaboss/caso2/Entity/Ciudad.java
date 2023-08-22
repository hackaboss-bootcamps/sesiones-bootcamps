package com.hackaboss.caso2.Entity;

import javax.persistence.*;

@Entity
@Table(name="ciudad")
public class Ciudad extends  Auditoria{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "provincia_id", nullable = false)
    private Provincia provinciaId;
}
