package com.example.moneyapi.repository.lancamento;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.moneyapi.dto.LancamentoEstatisticaCategoria;
import com.example.moneyapi.model.Lancamento;
import com.example.moneyapi.repository.filter.LancamentoFilter;
import com.example.moneyapi.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
