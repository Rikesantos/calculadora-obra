package com.meuprojeto.calculadora_obra.service;

import com.meuprojeto.calculadora_obra.model.Aresta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TijoloService {
    public double calcularQuantidadeTijolos(List<Aresta> arestas) {
        double areaTotal = 0;

        for (Aresta a : arestas) {
            areaTotal += a.calcularAreaLiquida();
        }

        double areaTijolo = 0.20 * 0.10; // 0.02 m²
        return areaTotal / areaTijolo;

    }


}