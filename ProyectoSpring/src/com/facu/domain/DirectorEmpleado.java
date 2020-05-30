package com.facu.domain;

import com.facu.interfaces.CreacionInformes;
import com.facu.interfaces.Empleados;

public class DirectorEmpleado implements Empleados {

	//Creaci�n de campo tipo CreacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	//M�todo Init. Ejecutar tareaas antes de que el bean est� disponible.
	public void init() {
		System.out.println("Dentro del m�todo init. Van las tareas a "
				+ "ejecutar antes de que el bean este listo.");
	}
	
	//M�todo destroy. Ejecutar tareas despu�s de que el bean haya sido utilizado.
	public void destroy() {
		System.out.println("Dentro del m�todo destroy. Van las tareas a "
				+ "ejecutar despu�s de utilizar el bean.");
	}
	
}
