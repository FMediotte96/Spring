package com.facu.domainAnnotations;

import org.springframework.stereotype.Component;

import com.facu.interfaces.CreacionInformeFinanciero;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación del informe financiero del trimestre 1";
	}

}
