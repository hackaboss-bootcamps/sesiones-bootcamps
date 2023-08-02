package com.hackaboss.nota.IRepository;

import com.hackaboss.nota.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {
    //Construir métodos personalizados - en este espacio se puede construir sql native.
}
