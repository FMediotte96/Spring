package com.facu.domain;

import com.facu.interfaces.CreacionInformes;

public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {
		return "Esta es la presentación del informe";
	}

}
