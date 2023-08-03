package io.davorpatech.apps.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @GetMapping
    public String index() {
        return "Hello World!";
    }

    @GetMapping("salute")
    public String salute() {
        return "Kaixo!";
    }

    @GetMapping("farewell")
    public String farewell() {
        return "さようなら!";
    }
}
