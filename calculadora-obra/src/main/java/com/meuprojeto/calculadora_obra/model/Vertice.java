package com.meuprojeto.calculadora_obra.model;

import jakarta.persistence.*;

@Entity
public class Vertice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Vertice() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
