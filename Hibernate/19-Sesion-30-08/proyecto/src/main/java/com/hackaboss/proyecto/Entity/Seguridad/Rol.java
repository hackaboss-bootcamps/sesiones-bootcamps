package com.hackaboss.proyecto.Entity.Seguridad;

import com.hackaboss.proyecto.Entity.Component.Auditoria;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="rol")
public class Rol extends Auditoria {
    @Column(name = "nombre",length = 50, nullable = false, unique = true)
    private String nombre;

    @NotNull
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vista_rol", joinColumns = @JoinColumn(name = "rol_id"), inverseJoinColumns = @JoinColumn(name = "vista_id"))
    private Set<Vista> vista = new HashSet<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
