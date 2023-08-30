package com.hackaboss.proyecto.Entity.Seguridad;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona extends Auditoria {

    @Column(name = "tipo_documento",length = 50, nullable = false)
    private String tipoDocumento;
    @Column(name = "documento",length = 15, nullable = false, unique = true)
    private String documento;
    @Column(name = "primer_nombre",length = 50, nullable = false)
    private String primerNombre;
    @Column(name = "segundo_nombre",length = 50, nullable = true)
    private String segundoNombre;
    @Column(name = "primer_apellido",length = 50, nullable = false)
    private String primerApellido;
    @Column(name = "segundo_apellido",length = 50, nullable = true)
    private String segundoApellido;
    @Column(name = "correo",length = 50, nullable = false)
    private String correo;
    @Column(name = "telefono",length = 50, nullable = true)
    private String telefono;
    @Column(name = "direccion",length = 50, nullable = false)
    private String direccion;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
