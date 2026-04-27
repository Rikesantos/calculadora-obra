package com.meuprojeto.calculadora_obra.service;

import com.meuprojeto.calculadora_obra.model.Aresta;
import com.meuprojeto.calculadora_obra.model.Comodo;
import com.meuprojeto.calculadora_obra.repository.ComodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComodoService {

    private final ComodoRepository repository;

    public ComodoService(ComodoRepository repository) {
        this.repository = repository;
    }

    public Comodo salvar(Comodo comodo) {
        return repository.save(comodo);
    }

    public List<Comodo> listar() {
        return repository.findAll();
    }

    public double calcularTijolos(Long id) {
        Comodo comodo = repository.findById(id).orElseThrow();

        double areaTotal = 0;

        for (Aresta a : comodo.getArestas()) {
            areaTotal += a.calcularAreaLiquida();
        }

        return Math.round(areaTotal * 20);
    }
}