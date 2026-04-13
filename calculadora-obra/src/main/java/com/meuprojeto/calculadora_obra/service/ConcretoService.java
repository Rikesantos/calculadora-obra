package com.meuprojeto.calculadora_obra.service;


import com.meuprojeto.calculadora_obra.model.Aresta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcretoService {

    public double calcularVolume(List<Aresta> arestas, double altura) {

        double volumeTotal = 0;

        for (Aresta a : arestas) {
            double volume = a.getLargura() * altura * a.getComprimento();
            volumeTotal += volume;
        }

        return volumeTotal;
    }
}
