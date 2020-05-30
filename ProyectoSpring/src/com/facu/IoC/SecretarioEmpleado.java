package com.facu.IoC;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		return "Informe generado por el secretario " + informeNuevo.getInforme();
	}

}
