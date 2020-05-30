package com.facu.domainAnnotations;

import org.springframework.stereotype.Component;

import com.facu.interfaces.Empleados;

@Component("Comerciante")
public class Comerciante implements Empleados{

	@Override
	public String getTareas() {
		return "Vender";
	}

	@Override
	public String getInforme() {
		return "Informe generado por el comerciante";
	}
	

}
