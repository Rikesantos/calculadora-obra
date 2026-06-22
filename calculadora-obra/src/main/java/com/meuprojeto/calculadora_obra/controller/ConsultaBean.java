package com.meuprojeto.calculadora_obra.controller;

import com.meuprojeto.calculadora_obra.entity.Orcamento;
import com.meuprojeto.calculadora_obra.repository.OrcamentoRepository;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ConsultaBean implements Serializable {

    private String nomeCliente;

    private List<Orcamento> orcamentos;

    @Autowired
    private OrcamentoRepository repository;

    public void buscar() {

        System.out.println("BOTAO BUSCAR FOI CLICADO");

        orcamentos = repository.findByNomeCliente(nomeCliente);

        System.out.println("Resultado: " + orcamentos.size());
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }
}