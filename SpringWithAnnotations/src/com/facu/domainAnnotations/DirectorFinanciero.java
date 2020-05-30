package com.facu.domainAnnotations;

import com.facu.interfaces.CreacionInformeFinanciero;
import com.facu.interfaces.Empleados;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero informeFinanciero;
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		return "Gestión y dirección de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		return informeFinanciero.getInformeFinanciero();
	}

}
