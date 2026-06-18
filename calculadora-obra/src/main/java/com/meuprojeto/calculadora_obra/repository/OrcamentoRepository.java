package com.meuprojeto.calculadora_obra.repository;

import com.meuprojeto.calculadora_obra.entity.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
}