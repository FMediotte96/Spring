package com.facu.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facu.IoC.DirectorEmpleado;
/**
 * Clase Main
 * @author fmediotte
 *
 */
public class UsoEmpleados {

	public static void main(String[] args) {

		//Creación de objetos de tipo Empleado
		/*Empleados empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
		System.out.println(empleado1.getTareas());*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado juan = context.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		System.out.println(juan.getEmail());
		System.out.println(juan.getNombreEmpresa());
		
		/*SecretarioEmpleado maria = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());
		
		//Inyeccion de campos por medio del applicationContext.xml
		System.out.println("Email: " + maria.getEmail());
		System.out.println(maria.getNombreEmpresa());
		
		SecretarioEmpleado pablo = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		System.out.println("Email Pablo: " + pablo.getEmail());*/
		context.close();
		
	}

}
