package org.curso2023.demo.controller;

import org.curso2023.demo.service.CalculadoraService;
import org.springframework.web.bind.annotation.*;

@RestController
public class DummyController {


    @GetMapping("salute")
    public String saludar(){
        return "Kaixo Mundua";
    }

    @GetMapping("farewell")
    public String despedirse(){
        return "さようなら世界";
    }

}
