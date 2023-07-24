package org.curso2023.demo.controller;

import org.curso2023.demo.service.CalculadoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private CalculadoraService service = new CalculadoraService();

    @GetMapping("divide")
    public String divide(@RequestParam Double num1, @RequestParam Double num2){
        return "El resultado de la divisón es: " + service.division(num1, num2);
    }
}
