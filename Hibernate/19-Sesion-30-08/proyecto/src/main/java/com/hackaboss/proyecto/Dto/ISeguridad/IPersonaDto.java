package com.hackaboss.proyecto.Dto.ISeguridad;

import com.hackaboss.proyecto.Dto.Component.IGenericDto;

public interface IPersonaDto extends IGenericDto {
    String getTipoDocumento();
    String getDocumento();
    String getPrimerNombre();
    String getSegundoNombre();
    String getPrimerApellido();
    String getSegundoApellido();
    String getCorreo();
    String getTelefono();
    String getDireccion();
}
