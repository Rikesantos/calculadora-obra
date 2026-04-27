package com.meuprojeto.calculadora_obra.model;

public class ResultadoObra {

    private double quantidadeTijolos;
    private double volumeConcreto;

    public ResultadoObra(double quantidadeTijolos, double volumeConcreto) {
        this.quantidadeTijolos = quantidadeTijolos;
        this.volumeConcreto = volumeConcreto;
    }

    public double getQuantidadeTijolos() {
        return quantidadeTijolos;
    }

    public double getVolumeConcreto() {
        return volumeConcreto;
    }
}