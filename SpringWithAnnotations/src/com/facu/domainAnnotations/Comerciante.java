package com.facu.domainAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
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
//@Scope("prototype")
public class Comerciante implements Empleados {
	
	//@Qualifier: Se utiliza para identificar el id del bean 
	//que necesitamos inyectar, en el caso de que haya muchas clases que implementa la interfaz principal
	@Autowired
	@Qualifier("informeFinancieroTrim4") 
	private CreacionInformeFinanciero nuevoInforme;
	
	public Comerciante() {
		
	}
	
	/*@Autowired //Con constructor
	public Comerciante(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	/*@Autowired //Con setter
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		return "Vender";
	}

	@Override
	public String getInforme() {
		//return "Informe generado por el comerciante";
		return nuevoInforme.getInformeFinanciero();
	}
	
	//Ejecuci�n de c�digo despu�s de creaci�n del Bean
	@PostConstruct
	public void init() {
		//System.out.println("Ejecutado tras creaci�n de Bean");
	}
	
	//Ejecuci�n de c�digo despu�s de apagado de contenedor Spring
	@PreDestroy
	public void destroy() {
		//System.out.println("Ejecutado antes de la destrucci�n");
	}

}
