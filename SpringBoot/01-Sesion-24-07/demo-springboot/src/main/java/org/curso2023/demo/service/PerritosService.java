package org.curso2023.demo.service;

import org.curso2023.demo.model.Perrito;
import org.curso2023.demo.persistence.BaseDeDatos;

import java.util.List;

public class PerritosService {

    BaseDeDatos baseDeDatos = new BaseDeDatos();

    public List<Perrito> getTodosLosPerritos() {
        return baseDeDatos.getPerritos();
    }

    public boolean guardarUnPerrito(Perrito p) {
        boolean respuesta = false;

        if(p.getEdad() < 20){
            baseDeDatos.guardarPerrito(p);
            respuesta = true;
        }

        return respuesta;
    }
}
