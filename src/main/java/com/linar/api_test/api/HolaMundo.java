package com.linar.api_test.api;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hola-mundo")
public class HolaMundo {


    @GetMapping
    public String holaMundo() {
        return "Hola mundo!";

    }

    @GetMapping(path = "/hola2/{nombres}/{apellidos}")
    public String holaMundo2(@PathVariable(name = "nombres") String nombre, @PathVariable(name = "apellidos") String apellido) {
        return "Hola ".concat(nombre).concat(" ").concat(apellido).concat(" ");

    }

    @GetMapping(path = "/hola3")
    public String holaMundo3(@RequestParam(name = "tu-nombre") String nombre, @RequestParam(name = "tu-apellido") String apellido) {
        return "Hola ".concat(nombre).concat(" ").concat(apellido).concat("!");




    }
}
