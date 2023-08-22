package com.hackaboss.caso1.Entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.time.LocalDateTime;

@Entity
@Table(name = "continente")
public class Continente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 50)
    private String nombre;
    @Column(name = "estado")
    private Boolean Estado;
    @Column(name = "fecha_creacion", nullable = false)
    @CreationTimestamp
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_modificacion", nullable = true)
    private LocalDateTime fechaModificacion;
    @Column(name = "fecha_eliminacion", nullable = true)
    private LocalDateTime fechaEliminacion;
}
