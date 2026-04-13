package com.meuprojeto.calculadora_obra.service;

import com.meuprojeto.calculadora_obra.model.Aresta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TijoloService {

    public double calcularQuantidade(List<Aresta> arestas,
                                     double alturaTijolo,
                                     double larguraTijolo) {

        double total = 0;
        double areaTijolo = alturaTijolo * larguraTijolo;

        for (Aresta a : arestas) {
            double areaParede = a.calcularAreaLiquida();
            total += areaParede / areaTijolo;
        }

        return Math.ceil(total);
    }
}


