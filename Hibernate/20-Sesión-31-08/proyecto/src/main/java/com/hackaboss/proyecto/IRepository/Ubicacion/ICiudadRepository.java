package com.hackaboss.proyecto.IRepository.Ubicacion;

import com.hackaboss.proyecto.Entity.Ubicacion.Ciudad;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadRepository extends IBaseRepository<Ciudad, Long> {

}
