package com.facu.domainAnnotations;

import org.springframework.stereotype.Component;

import com.facu.interfaces.CreacionInformeFinanciero;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación de informe financiero negativo del trimestre 2";
	}

}
