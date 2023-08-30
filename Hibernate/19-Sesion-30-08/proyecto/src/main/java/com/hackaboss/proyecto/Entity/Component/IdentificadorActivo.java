package com.hackaboss.proyecto.Entity.Component;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class IdentificadorActivo extends IdentificadorId {
    @Column(name = "activo", nullable = false)
    private Boolean activo;

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
