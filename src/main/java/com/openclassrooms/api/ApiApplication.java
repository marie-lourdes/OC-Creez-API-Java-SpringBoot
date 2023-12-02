package com.openclassrooms.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Pour générer la documentation, il faut placer l'annotation  @EnableSwagger2  dans la classe contenant la méthode Main.

@SpringBootApplication
//@EnableSwagger2 // pas d annotation a partir de spring 3 car toujourss pas compatible avec sawagger , donc ajout de la dependance
//springdoc-openapi-starter-webmvc-ui en complement de la depndance swagger dans le pom.xml , aucune configauration necessaire

//url de la documentation json :http://localhost:9000/v3/api-docs, v3 pour spring boot 3..
//url de la documentation html :http://localhost:9000/swagger-ui/index.html
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
