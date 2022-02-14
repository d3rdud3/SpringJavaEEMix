package de.sbo.order.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import de.sbo.order.api.AliveController;

@SpringBootApplication
@ComponentScan(basePackageClasses = {AliveController.class})
public class OrderServiceApplication {

	public static void main(String[] args) {

	//test223
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
