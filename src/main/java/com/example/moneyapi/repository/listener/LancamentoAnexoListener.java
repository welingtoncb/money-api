package com.example.moneyapi.repository.listener;

import javax.persistence.PostLoad;

import org.springframework.util.StringUtils;

import com.example.moneyapi.MoneyApiApplication;
import com.example.moneyapi.model.Lancamento;
import com.example.moneyapi.storage.S3;

public class LancamentoAnexoListener {
	
	@PostLoad
	public void postLoad(Lancamento lancamento) {
		if (StringUtils.hasText(lancamento.getAnexo())) {
			S3 s3 = MoneyApiApplication.getBean(S3.class);
			lancamento.setUrlAnexo(s3.configurarUrl(lancamento.getAnexo()));
		} 
	}

}
