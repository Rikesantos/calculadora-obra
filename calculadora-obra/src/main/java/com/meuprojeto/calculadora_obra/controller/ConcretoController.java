package com.meuprojeto.calculadora_obra.controller;


import com.meuprojeto.calculadora_obra.model.Aresta;
import com.meuprojeto.calculadora_obra.repository.ArestaRepository;
import com.meuprojeto.calculadora_obra.service.ConcretoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/concreto")
public class ConcretoController {

    @Autowired
    private ConcretoService service;

    @Autowired
    private ArestaRepository repository;

    @PostMapping("/calcular")
    public ResponseEntity<Double> calcular(@RequestBody List<Aresta> arestas,
                                           @RequestParam double altura) {

        // salva no banco
        repository.saveAll(arestas);

        // calcula
        double resultado = service.calcularVolume(arestas, altura);

        return ResponseEntity.ok(resultado);
    }
}