package com.hackaboss.proyecto.IRepository.Ubicacion;

import com.hackaboss.proyecto.Entity.Ubicacion.Provincia;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IProvinciaRepository extends IBaseRepository<Provincia, Long> {

}
