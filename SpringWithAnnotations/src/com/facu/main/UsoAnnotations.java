package com.facu.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facu.interfaces.Empleados;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		//Leer el xml de configuración
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Obtener beans al contenedor
		Empleados emp1 = context.getBean("comerciante", Empleados.class);
		
		//Usar el bean
		System.out.println(emp1.getInforme());
		System.out.println(emp1.getTareas());
		
		//Cerrar el contexto
		context.close();
	}
}
