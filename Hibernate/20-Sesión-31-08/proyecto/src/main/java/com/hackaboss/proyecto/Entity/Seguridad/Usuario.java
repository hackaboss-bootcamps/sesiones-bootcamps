package com.hackaboss.proyecto.Entity.Seguridad;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario extends Auditoria {

    @Column(name = "usuario",length = 50, nullable = false, unique = true)
    private String usuario;
    @Column(name = "contrasenia",length = 100, nullable = false)
    private String contrasenia;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persona_id", nullable = false, unique = true)
    private Persona personaId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "rol_id", nullable = false, unique = true)
    private Rol rolId;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    public Rol getRolId() {
        return rolId;
    }

    public void setRolId(Rol rolId) {
        this.rolId = rolId;
    }
}
