package com.facu.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facu.domain.SecretarioEmpleado;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {

		//Carga XML de configuración
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//petición de beans al contenedor Spring
		//Estos dos beans apuntan al mismo objeto, en este punto implementamos el Singleton
		SecretarioEmpleado empleado1 = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado empleado2 = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado empleado3 = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado empleado4 = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado empleado5 = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		//Tienen los dos la misma dirección de memoria
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
		System.out.println(empleado5);
		
		/*if(empleado1==empleado2) {
			System.out.println("Apuntan al mismo objeto");
		} else {
			System.out.println("No se trata del mismo objeto");
		}*/
		
	}

}
