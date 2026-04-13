package com.meuprojeto.calculadora_obra.model;


import jakarta.persistence.*;

@Entity
public class Aresta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double comprimento;
    private double largura;
    private double altura;

    private boolean temPorta;
    private boolean temJanela;

    private double alturaPorta;
    private double larguraPorta;

    private double alturaJanela;
    private double larguraJanela;

    public Aresta() {}

    public double calcularAreaLiquida() {
        double areaParede = altura * comprimento;

        double areaPorta = temPorta ? alturaPorta * larguraPorta : 0;
        double areaJanela = temJanela ? alturaJanela * larguraJanela : 0;

        return areaParede - (areaPorta + areaJanela);
    }

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isTemPorta() {
        return temPorta;
    }

    public void setTemPorta(boolean temPorta) {
        this.temPorta = temPorta;
    }

    public boolean isTemJanela() {
        return temJanela;
    }

    public void setTemJanela(boolean temJanela) {
        this.temJanela = temJanela;
    }

    public double getAlturaPorta() {
        return alturaPorta;
    }

    public void setAlturaPorta(double alturaPorta) {
        this.alturaPorta = alturaPorta;
    }

    public double getLarguraPorta() {
        return larguraPorta;
    }

    public void setLarguraPorta(double larguraPorta) {
        this.larguraPorta = larguraPorta;
    }

    public double getAlturaJanela() {
        return alturaJanela;
    }

    public void setAlturaJanela(double alturaJanela) {
        this.alturaJanela = alturaJanela;
    }

    public double getLarguraJanela() {
        return larguraJanela;
    }

    public void setLarguraJanela(double larguraJanela) {
        this.larguraJanela = larguraJanela;
    }
}