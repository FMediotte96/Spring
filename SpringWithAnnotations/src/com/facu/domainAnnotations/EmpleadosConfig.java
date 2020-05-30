package com.facu.domainAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.facu.interfaces.CreacionInformeFinanciero;
import com.facu.interfaces.Empleados;

/**
 * Esta clase es utilizada a modo de configuracion del framework Spring y es el reemplazo mediante
 * Annotations de nuestro applicationContext.xml por lo que implementamos Spring puramente con clase Java
 * @Configuration se utiliza para indicar que es la clase de configuracion de Spring
 * @ComponentScan se utiliza para buscar todas las clases que usen annotations Spring del tipo @Component para 
 * 					poder lograr la inyección de dependencia lo que nos evita usar el uso excesivo de constructores y
 * 					de reservas de memoria
 * 
 * @author fmediotte
 */
@Configuration
@ComponentScan("com.facu.domainAnnotations")
@PropertySource("classpath:datosEmpresa.properties")
public class EmpleadosConfig {
	
	//Definir el bean para InformeFinancieroDtoCompras
	//el nombre del método es el id del Bean inyectado
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { 
		return new InformeFinancieroDtoCompras();
	}
	
	//Definir el bean para DirectoFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}

}
