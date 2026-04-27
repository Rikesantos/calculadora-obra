package com.meuprojeto.calculadora_obra.service;

import com.meuprojeto.calculadora_obra.model.Aresta;
import com.meuprojeto.calculadora_obra.model.ResultadoArgamassa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArgamassaService {

    public ResultadoArgamassa calcular(List<Aresta> arestas) {

        double areaTotal = 0;

        for (Aresta a : arestas) {
            areaTotal += a.calcularAreaLiquida();
        }

        double cimento = areaTotal * 5;
        double areia = areaTotal * 0.015;

        return new ResultadoArgamassa(areaTotal, cimento, areia);
    }
}