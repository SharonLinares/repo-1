package com.linar.api_test.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class Calculadora {


    @GetMapping(path = "/suma/{num1}/{num2}")
    public int suma(@PathVariable(name = "num1") int num1, @PathVariable(name = "num2") int num2) {
        return num1 + num2;
    }


    @GetMapping(path = "/resta/{num1}/{num2}")
    public int resta(@PathVariable(name = "num1") int num1, @PathVariable(name = "num2") int num2) {
        return num1 - num2;


    }

}
