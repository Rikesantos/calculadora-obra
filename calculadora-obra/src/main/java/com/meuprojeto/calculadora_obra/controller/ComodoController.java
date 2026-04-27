package com.meuprojeto.calculadora_obra.controller;

import com.meuprojeto.calculadora_obra.model.Comodo;
import com.meuprojeto.calculadora_obra.service.ComodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comodos")
public class ComodoController {

    private final ComodoService service;

    public ComodoController(ComodoService service) {
        this.service = service;
    }

    @PostMapping
    public Comodo salvar(@RequestBody Comodo comodo) {
        return service.salvar(comodo);
    }

    @GetMapping
    public List<Comodo> listar() {
        return service.listar();
    }

    @GetMapping("/{id}/tijolos")
    public double calcularTijolos(@PathVariable Long id) {
        return service.calcularTijolos(id);
    }
}