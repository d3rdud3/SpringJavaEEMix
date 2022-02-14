package de.sbo.bill.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import de.sbo.bill.api.AliveController;

@SpringBootApplication
@ComponentScan(basePackageClasses = {AliveController.class})
public class BillingServiceApplication {

	public static void main(String[] args) {

	//test223
		SpringApplication.run(BillingServiceApplication.class, args);
	}

}
