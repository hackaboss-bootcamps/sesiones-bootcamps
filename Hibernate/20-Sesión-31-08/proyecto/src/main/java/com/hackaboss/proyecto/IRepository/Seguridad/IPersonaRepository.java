package com.hackaboss.proyecto.IRepository.Seguridad;

import com.hackaboss.proyecto.Entity.Seguridad.Persona;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends IBaseRepository<Persona, Long> {

}
