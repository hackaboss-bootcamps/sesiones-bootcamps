package io.davorpatech.apps.springbootdemo.controller;

import io.davorpatech.apps.springbootdemo.service.impl.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController()
@RequestMapping("calculator")
public class CalculatorController
{
    private CalculatorService calculatorService;

    public CalculatorController(
            final @Autowired CalculatorService calculatorService) {
        this.calculatorService = Objects.requireNonNull(
                calculatorService, "calculatorService must not be null!");
    }

    @GetMapping("add")
    public double add(
            @RequestParam double num1,
            @RequestParam double num2) {
        return calculatorService.add(num1, num2);
    }

    @GetMapping("substract")
    public double substract(
            @RequestParam double num1,
            @RequestParam double num2) {
        return calculatorService.substract(num1, num2);
    }

    @GetMapping("multiply")
    public double multiply(
            @RequestParam double num1,
            @RequestParam double num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("divide")
    public double divide(
            @RequestParam double dividend,
            @RequestParam double divisor) {
        return calculatorService.divide(dividend, divisor);
    }
}
