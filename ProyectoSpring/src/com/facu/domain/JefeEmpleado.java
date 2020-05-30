package com.facu.domain;

import com.facu.interfaces.CreacionInformes;
import com.facu.interfaces.Empleados;

/**
 * Inversión of Control
 * @author fmediotte
 *
 */
public class JefeEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;

	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
}
