package com.facu.domainAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.facu.interfaces.CreacionInformeFinanciero;
import com.facu.interfaces.Empleados;

/**
 * 
 * @author fmediotte
 *
 */
//Se puede obviar el nombre del component, en ese caso tomara el nombre de la clase
@Component
public class Comerciante implements Empleados {
	
	private CreacionInformeFinanciero nuevoInforme;
	
	@Autowired
	public Comerciante(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	@Override
	public String getTareas() {
		return "Vender";
	}

	@Override
	public String getInforme() {
		//return "Informe generado por el comerciante";
		return nuevoInforme.getInformeFinanciero();
	}

}
