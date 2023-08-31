package com.hackaboss.proyecto.IRepository.Seguridad;

import com.hackaboss.proyecto.Entity.Seguridad.Rol;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Repository
public interface IRolRepository extends IBaseRepository<Rol, Long> {
    
}
