package com.hackaboss.nota.IService;

import com.hackaboss.nota.Entity.Estudiante;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

public interface IEstudianteService {

    /**
    ** Método encargado de retornar la lista con todos los registros
    ***/
    List<Estudiante> all();

    /**
    ** Método encargado de retornar un registro por medio del ID
    ***/
    Optional<Estudiante> findById(Long id);

    /**
     **Método encargado de guardar los datos del registro
     ***/
    Estudiante save(Estudiante estudiante);

    /**
    **Método encargado de modificar los datos del registro
    ***/
    void update(Long id, Estudiante estudiante);

    /**
    **Método encargado de eliminar un registro
    ***/
    void delete(Long id);

    /**
     **Método encargado retornar la lista de estudiantes por orden alfabético
     ***/
    List<Estudiante> findOrderByNameStudent();

    /**
     **Método encargado retornar la lista de estudiantes por orden alfabético por nombre específico.
     ***/
    List<Estudiante> findListByNameStudent(String nameStudent);
}
