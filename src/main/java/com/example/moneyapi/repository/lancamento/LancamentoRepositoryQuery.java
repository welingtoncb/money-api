package com.example.moneyapi.repository.lancamento;

import java.util.List;

import com.example.moneyapi.model.Lancamento;
import com.example.moneyapi.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
