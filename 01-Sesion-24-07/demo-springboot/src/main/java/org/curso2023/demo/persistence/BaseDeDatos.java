package org.curso2023.demo.persistence;

import org.curso2023.demo.model.Perrito;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {

    private List<Perrito> perritos = new ArrayList();

    public BaseDeDatos() {
        getPerritos().add(new Perrito("Nero", "Bulldog inglés", 4));
        getPerritos().add(new Perrito("Yuma", "Chandosa", 3));
    }


    public List<Perrito> getPerritos() {
        return perritos;
    }

    public void guardarPerrito(Perrito p) {
        this.perritos.add(p);
    }
}
