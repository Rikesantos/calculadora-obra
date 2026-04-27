package com.meuprojeto.calculadora_obra.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Vertice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Arestas que SAEM desse vértice
    @OneToMany(mappedBy = "inicio")
    private List<Aresta> arestasInicio;

    // Arestas que CHEGAM nesse vértice
    @OneToMany(mappedBy = "fim")
    private List<Aresta> arestasFim;

    public Vertice() {}

    public Long getId() {
        return id;
    }

    public List<Aresta> getArestasInicio() {
        return arestasInicio;
    }

    public void setArestasInicio(List<Aresta> arestasInicio) {
        this.arestasInicio = arestasInicio;
    }

    public List<Aresta> getArestasFim() {
        return arestasFim;
    }

    public void setArestasFim(List<Aresta> arestasFim) {
        this.arestasFim = arestasFim;
    }
}