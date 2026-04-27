package com.meuprojeto.calculadora_obra.controller;

import com.meuprojeto.calculadora_obra.model.Aresta;
import com.meuprojeto.calculadora_obra.model.ResultadoArgamassa;
import com.meuprojeto.calculadora_obra.repository.ArestaRepository;
import com.meuprojeto.calculadora_obra.service.ArgamassaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/argamassa")
public class ArgamassaController {

    @Autowired
    private ArgamassaService service;

    @Autowired
    private ArestaRepository repository;

    @PostMapping("/calcular")
    public ResultadoArgamassa calcular(@RequestBody List<Aresta> arestas) {

        // salva no banco
        repository.saveAll(arestas);

        // calcula
        return service.calcular(arestas);
    }
}