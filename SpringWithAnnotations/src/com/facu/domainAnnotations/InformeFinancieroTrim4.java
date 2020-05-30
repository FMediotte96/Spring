package com.facu.domainAnnotations;

import org.springframework.stereotype.Component;

import com.facu.interfaces.CreacionInformeFinanciero;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentaci�n de informe de cierre de a�o";
	}

}
