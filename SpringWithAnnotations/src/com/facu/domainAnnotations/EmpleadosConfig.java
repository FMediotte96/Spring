package com.facu.domainAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
public class EmpleadosConfig {

}
