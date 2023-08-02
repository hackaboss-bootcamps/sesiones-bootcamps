package org.curso2023.demo.controller;

import org.curso2023.demo.model.Perrito;
import org.curso2023.demo.service.PerritosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerritoController {

    private final PerritosService service = new PerritosService();

    @GetMapping("perritos")
    public List<Perrito> consultarTodos(){
        return service.getTodosLosPerritos();
    }

    @PostMapping("nuevo-perrito")
    public String agregarPerrito(@RequestBody Perrito p){
        String respuesta;

        if(service.guardarUnPerrito(p)){
            respuesta = "El perrito " + p.getNombre() + " ha sido guardado con éxito";
        }else{
            respuesta = "Oops, la edad no es válida.";
        }

        return respuesta;
    }

}
