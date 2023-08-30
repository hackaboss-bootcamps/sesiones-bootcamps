package com.hackaboss.proyecto.IRepository.Ubicacion;

import com.hackaboss.proyecto.Entity.Ubicacion.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadRepository extends JpaRepository<Ciudad, Long> {

}
