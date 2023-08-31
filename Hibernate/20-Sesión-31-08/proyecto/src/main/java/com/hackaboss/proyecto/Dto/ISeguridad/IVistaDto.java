package com.hackaboss.proyecto.Dto.ISeguridad;

import com.hackaboss.proyecto.Dto.Component.IGenericDto;

public interface IVistaDto extends IGenericDto {
    String getNombre();
    String getEtiqueta();
    Long getRuta();
}
