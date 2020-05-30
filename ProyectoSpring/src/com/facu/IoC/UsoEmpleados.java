package com.facu.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		//Creación de objetos de tipo Empleado
		/*Empleados empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
		System.out.println(empleado1.getTareas());*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Empleados juan = context.getBean("miEmpleado", Empleados.class);
		
		System.out.println(juan.getTareas());
		
		System.out.println(juan.getInforme());*/
		
		Empleados maria = context.getBean("miSecretarioEmpleado", Empleados.class);
		
		System.out.println(maria.getTareas());
		
		System.out.println(maria.getInforme());

		context.close();
		
	}

}
