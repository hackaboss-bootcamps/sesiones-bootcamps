package com.hackaboss.proyecto.Entity.Seguridad;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="vista")
public class Vista extends Auditoria {
    @Column(name = "nombre",length = 50, nullable = false, unique = true)
    private String nombre;
    @Column(name = "etiqueta",length = 100, nullable = false)
    private String etiqueta;
    @Column(name = "ruta",length = 200, nullable = false, unique = true)
    private String ruta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
