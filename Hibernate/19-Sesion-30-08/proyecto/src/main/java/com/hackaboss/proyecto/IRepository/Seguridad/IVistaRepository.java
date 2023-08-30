package com.hackaboss.proyecto.IRepository.Seguridad;

import com.hackaboss.proyecto.Entity.Seguridad.Vista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVistaRepository extends JpaRepository<Vista, Long> {
    
}
