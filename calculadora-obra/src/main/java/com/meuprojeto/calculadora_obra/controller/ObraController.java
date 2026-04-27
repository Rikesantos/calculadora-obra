package com.meuprojeto.calculadora_obra.controller;

import com.meuprojeto.calculadora_obra.model.Aresta;
import com.meuprojeto.calculadora_obra.model.ResultadoObra;
import com.meuprojeto.calculadora_obra.repository.ArestaRepository;
import com.meuprojeto.calculadora_obra.service.ObraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/obra")
public class ObraController {

    private final ObraService service;
    private final ArestaRepository repository;

    public ObraController(ObraService service, ArestaRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @PostMapping("/resumo")
    public ResultadoObra resumo(@RequestBody List<Aresta> arestas,
                                @RequestParam double alturaBaldrame) {

        repository.saveAll(arestas);

        return service.calcularResumo(arestas, alturaBaldrame);
    }
}