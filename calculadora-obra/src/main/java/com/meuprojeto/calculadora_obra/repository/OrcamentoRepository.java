package com.meuprojeto.calculadora_obra.repository;

import com.meuprojeto.calculadora_obra.entity.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {

    List<Orcamento> findByNomeCliente(String nomeCliente);

}