package com.facu.domainAnnotations;

import org.springframework.beans.factory.annotation.Value;

import com.facu.interfaces.CreacionInformeFinanciero;
import com.facu.interfaces.Empleados;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero informeFinanciero;
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
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

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
}
