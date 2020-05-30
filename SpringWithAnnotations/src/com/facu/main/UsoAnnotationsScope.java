package com.facu.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facu.domainAnnotations.EmpleadosConfig;
import com.facu.interfaces.Empleados;

public class UsoAnnotationsScope {

	public static void main(String[] args) {
		
		//Leo el xml de configuración
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//leer el class de configuración
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//Pido el bean al contenedor
		Empleados emp1 = context.getBean("comerciante", Empleados.class);
		Empleados emp2 = context.getBean("comerciante", Empleados.class);
		
		if(emp1 == emp2) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(emp1  + "\n" + emp2);
		} else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(emp1  + "\n" + emp2);
		}
		
		//Cerramos el contexto
		context.close();
	}
}
