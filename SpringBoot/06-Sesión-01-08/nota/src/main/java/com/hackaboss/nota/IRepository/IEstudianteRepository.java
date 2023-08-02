package com.hackaboss.nota.IRepository;

import com.hackaboss.nota.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante,Long> {
    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
    ** Mostrar lista por orden alfabético.
    ***/
    @Query(value = "SELECT " +
            " id," +
            " nombre_completo," +
            " dni," +
            " correo," +
            " telefono," +
            " contrasenia" +
            "FROM " +
            " estudiante" +
            "ORDER BY nombre_completo ASC", nativeQuery = true)
    List<Estudiante> findOrderByNameStudent();

    /**
     ** Mostrar lista por orden alfabético por nombre de la persona.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " nombre_completo," +
            " dni," +
            " correo," +
            " telefono," +
            " contrasenia " +
            " FROM " +
            " estudiante " +
            " WHERE nombre_estudiante = :nameStudent " +
            " ORDER BY nombre_completo ASC;", nativeQuery = true)
    List<Estudiante> findListByNameStudent(@Param("nameStudent") String nameStudent);
}
