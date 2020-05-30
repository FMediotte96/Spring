package com.facu.domainAnnotations;

import org.springframework.stereotype.Component;

import com.facu.interfaces.CreacionInformeFinanciero;

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación de informe favorable del trimestre 3";
	}

}
