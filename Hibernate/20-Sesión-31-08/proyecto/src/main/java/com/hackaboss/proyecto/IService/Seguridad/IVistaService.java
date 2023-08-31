package com.hackaboss.proyecto.IService.Seguridad;

import com.hackaboss.proyecto.Dto.ISeguridad.IVistaDto;
import com.hackaboss.proyecto.Entity.Seguridad.Vista;
import com.hackaboss.proyecto.IService.Component.IBaseService;

import java.util.List;

public interface IVistaService extends IBaseService<Vista> {
    List<IVistaDto> getListRoute();
}
