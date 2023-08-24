package com.hackaboss.proyecto.Entity.Component;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class Auditoria extends IdentificadorActivo {

    @Column(name = "fecha_cracion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_modificacion", nullable = true)
    private LocalDateTime fechaModificacion;

    @Column(name = "fecha_eliminacion", nullable = true)
    private LocalDateTime fechaEliminacion;

    @Column(name = "usuario_creacion", nullable = false)
    private Long usuarioCreacion;

    @Column(name = "usuario_modificacion", nullable = true)
    private Long usuarioModificacion;

    @Column(name = "usuario_eliminacion", nullable = true)
    private Long usuarioeliminacion;
}
