package com.hackaboss.caso2.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
public class Auditoria {
    @Column(name="estado")
    private Boolean Estado;
    @Column(name = "fecha_creacion", nullable = false)
    @CreationTimestamp
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_modificacion", nullable = true)
    @UpdateTimestamp
    private LocalDateTime fechaModificacion;
    @Column(name = "fecha_eliminacion", nullable = true)
    private LocalDateTime fechaEliminacion;
    @Column(name = "usuario_creacion", nullable = false)
    private Long usuarioCreacionId;
    @Column(name = "usuario_modificacion", nullable = true)
    private Long usuarioModificacionId;
    @Column(name = "usuario_eliminacion", nullable = true)
    private Long usuarioEliminacionId;
}
