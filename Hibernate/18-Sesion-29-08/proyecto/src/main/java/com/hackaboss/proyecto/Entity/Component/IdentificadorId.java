package com.hackaboss.proyecto.Entity.Component;

import javax.persistence.*;
@MappedSuperclass
public abstract class IdentificadorId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
