package com.facu.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facu.interfaces.Empleados;

public class LifeCicleBeanMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//Obtencion delbean
		Empleados emp1 = context.getBean("miEmpleado", Empleados.class);
		
		System.out.println(emp1.getInforme());
		
		//Cerrar el contexto
		context.close();

	}

}
