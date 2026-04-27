package com.meuprojeto.calculadora_obra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "API Calculadora de Obra funcionando! Use os endpoints:" +
                " /comodos, /concreto/calcular, /tijolos/calcular e /obra/resumo.";
    }
}