package com.meuprojeto.calculadora_obra.service;

import com.meuprojeto.calculadora_obra.model.Aresta;
import com.meuprojeto.calculadora_obra.model.ResultadoObra;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObraService {

    public ResultadoObra calcularResumo(List<Aresta> arestas, double alturaBaldrame) {
        double areaTotal = 0;
        double volumeConcreto = 0;

        for (Aresta a : arestas) {
            areaTotal += a.calcularAreaLiquida();
            volumeConcreto += a.getLargura() * alturaBaldrame * a.getComprimento();
        }

        double quantidadeTijolos = Math.round(areaTotal * 20);

        return new ResultadoObra(quantidadeTijolos, volumeConcreto);
    }
}