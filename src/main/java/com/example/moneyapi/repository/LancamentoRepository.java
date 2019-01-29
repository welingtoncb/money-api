package com.example.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moneyapi.model.Lancamento;
import com.example.moneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
