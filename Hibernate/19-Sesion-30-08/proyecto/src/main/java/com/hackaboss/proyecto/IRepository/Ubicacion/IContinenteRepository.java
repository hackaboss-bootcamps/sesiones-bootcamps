package com.hackaboss.proyecto.IRepository.Ubicacion;

import com.hackaboss.proyecto.Entity.Ubicacion.Continente;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContinenteRepository extends IBaseRepository<Continente,Long> {

}
