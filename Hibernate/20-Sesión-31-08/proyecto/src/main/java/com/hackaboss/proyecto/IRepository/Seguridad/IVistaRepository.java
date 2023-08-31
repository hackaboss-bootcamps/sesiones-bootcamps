package com.hackaboss.proyecto.IRepository.Seguridad;

import com.hackaboss.proyecto.Dto.ISeguridad.IUsuarioDto;
import com.hackaboss.proyecto.Dto.ISeguridad.IVistaDto;
import com.hackaboss.proyecto.Entity.Seguridad.Vista;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVistaRepository extends IBaseRepository<Vista, Long> {
    @Query(value = " SELECT " +
            "   nombre, " +
            "   etiqueta, " +
            "   ruta " +
            " FROM " +
            "   vista " +
            " ORDER BY nombre ASC ", nativeQuery = true)
    List<IVistaDto> getListRoute();
}
