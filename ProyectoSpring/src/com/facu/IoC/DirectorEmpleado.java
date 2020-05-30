package com.facu.IoC;

public class DirectorEmpleado implements Empleados {

	//Creaci�n de campo tipo CreacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	
	//Creaci�n de constructor que inyecta de dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
