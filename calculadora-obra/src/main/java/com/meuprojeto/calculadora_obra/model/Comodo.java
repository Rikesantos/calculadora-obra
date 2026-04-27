package com.meuprojeto.calculadora_obra.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Comodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double largura;
    private double comprimento;
    private double altura;

    // RELAÇÃO COM ARESTAS (paredes)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "comodo_id")
    private List<Aresta> arestas;

    public Comodo() {}

    public Comodo(String nome, double largura, double comprimento, double altura) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
        this.altura = altura;
    }

    // MÉTODO EXTRA (ajuda no cálculo)
    public double calcularAreaTotalParedes() {
        double total = 0;

        if (arestas != null) {
            for (Aresta a : arestas) {
                total += a.calcularAreaLiquida();
            }
        }

        return total;
    }

    // GETTERS E SETTERS

    public Long getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }

    public double getComprimento() { return comprimento; }
    public void setComprimento(double comprimento) { this.comprimento = comprimento; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public List<Aresta> getArestas() { return arestas; }
    public void setArestas(List<Aresta> arestas) { this.arestas = arestas; }
}