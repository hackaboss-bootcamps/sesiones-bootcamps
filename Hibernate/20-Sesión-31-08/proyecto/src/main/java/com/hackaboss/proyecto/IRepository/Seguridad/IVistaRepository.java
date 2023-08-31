package com.hackaboss.proyecto.IRepository.Seguridad;

import com.hackaboss.proyecto.Entity.Seguridad.Vista;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IVistaRepository extends IBaseRepository<Vista, Long> {
    
}
