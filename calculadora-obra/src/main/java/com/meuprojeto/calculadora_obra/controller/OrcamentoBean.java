package com.meuprojeto.calculadora_obra.controller;

import com.meuprojeto.calculadora_obra.entity.Orcamento;
import com.meuprojeto.calculadora_obra.repository.OrcamentoRepository;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

@Named
@ViewScoped
public class OrcamentoBean implements Serializable {

    private String nomeCliente;
    private Double areaCasa;
    private Double valorTotal;

    @Autowired
    private OrcamentoRepository repository;

    public void calcular() {

        valorTotal = areaCasa * 1500;

        Orcamento orcamento = new Orcamento();
        orcamento.setNomeCliente(nomeCliente);
        orcamento.setAreaCasa(areaCasa);
        orcamento.setValorTotal(valorTotal);

        repository.save(orcamento);

        System.out.println("SALVO: " + nomeCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getAreaCasa() {
        return areaCasa;
    }

    public void setAreaCasa(Double areaCasa) {
        this.areaCasa = areaCasa;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}