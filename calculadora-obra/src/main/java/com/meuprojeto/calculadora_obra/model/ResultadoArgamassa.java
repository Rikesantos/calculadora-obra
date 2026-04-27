package com.meuprojeto.calculadora_obra.model;

public class ResultadoArgamassa {

    private double areaTotal;
    private double cimentoKg;
    private double areiaM3;

    public ResultadoArgamassa(double areaTotal, double cimentoKg, double areiaM3) {
        this.areaTotal = areaTotal;
        this.cimentoKg = cimentoKg;
        this.areiaM3 = areiaM3;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public double getCimentoKg() {
        return cimentoKg;
    }

    public double getAreiaM3() {
        return areiaM3;
    }
}