package com.hackaboss.nota.IService;

import com.hackaboss.nota.Entity.Matricula;

import java.util.List;
import java.util.Optional;

public interface IMatriculaService {

    /**
     ** Método encargado de retornar la lista con todos los registros
     ***/
    List<Matricula> all();

    /**
     ** Método encargado de retornar un registro por medio del ID
     ***/
    Optional<Matricula> findById(Long id);

    /**
     **Método encargado de guardar los datos del registro
     ***/
    Matricula save(Matricula matricula);

    /**
     **Método encargado de modificar los datos del registro
     ***/
    void update(Long id, Matricula matricula);

    /**
     **Método encargado de eliminar un registro
     ***/
    void delete(Long id);
}
