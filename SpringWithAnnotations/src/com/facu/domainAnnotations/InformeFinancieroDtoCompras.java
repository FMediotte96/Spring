package com.facu.domainAnnotations;

import com.facu.interfaces.CreacionInformeFinanciero;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe financiero del Departamento de Compras año 2020";
	}

}
