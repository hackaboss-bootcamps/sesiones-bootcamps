package com.hackaboss.proyecto.Entity.Negocio;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="producto")
public class Producto extends Auditoria {
    @Column(name = "nombre", length = 50, unique = true, nullable = false)
    private String nombre;
    @Column(name = "precio", scale = 2, precision = 5)
    private BigDecimal precio;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
