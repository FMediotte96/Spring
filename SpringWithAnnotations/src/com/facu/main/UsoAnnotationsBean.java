package com.facu.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.facu.domainAnnotations.DirectorFinanciero;
import com.facu.domainAnnotations.EmpleadosConfig;
import com.facu.interfaces.Empleados;

public class UsoAnnotationsBean {

	public static void main(String[] args) {
		
		//Leer el class de configuracion
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//Pedir el bean al contenedor
		/*Empleados empleado = context.getBean("directorFinanciero",Empleados.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());*/
		
		DirectorFinanciero directorFinanciero = context.getBean("directorFinanciero",DirectorFinanciero.class);
		
		System.out.println("Email del director: " + directorFinanciero.getEmail());
		System.out.println("Nombre de la empresa: " + directorFinanciero.getNombreEmpresa());
		
		//cerrar el contexto
		context.close();
		
	}
}
