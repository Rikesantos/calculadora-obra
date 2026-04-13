package com.meuprojeto.calculadora_obra.controller;


import com.meuprojeto.calculadora_obra.model.Aresta;
import com.meuprojeto.calculadora_obra.repository.ArestaRepository;
import com.meuprojeto.calculadora_obra.service.TijoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tijolos")
public class TijoloController {

    @Autowired
    private TijoloService service;

    @Autowired
    private ArestaRepository repository;

    @PostMapping("/calcular")
    public double calcular(@RequestBody List<Aresta> arestas,
                           @RequestParam double alturaTijolo,
                           @RequestParam double larguraTijolo) {

        // salva no banco
        repository.saveAll(arestas);

        // calcula
        return service.calcularQuantidade(arestas, alturaTijolo, larguraTijolo);
    }
}
