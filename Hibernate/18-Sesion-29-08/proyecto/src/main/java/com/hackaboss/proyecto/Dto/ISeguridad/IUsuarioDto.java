package com.hackaboss.proyecto.Dto.ISeguridad;

import com.hackaboss.proyecto.Dto.IGenericDto;

public interface IUsuarioDto extends IGenericDto {
    String getUsuario();
    String getContrasenia();
    Long getPersonaId();
    String getPersona();
    Long getRolId();
    String getRol();
}
