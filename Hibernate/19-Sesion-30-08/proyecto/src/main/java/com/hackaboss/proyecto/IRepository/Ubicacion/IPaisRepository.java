package com.hackaboss.proyecto.IRepository.Ubicacion;

import com.hackaboss.proyecto.Entity.Ubicacion.Continente;
import com.hackaboss.proyecto.Entity.Ubicacion.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Long> {

}
