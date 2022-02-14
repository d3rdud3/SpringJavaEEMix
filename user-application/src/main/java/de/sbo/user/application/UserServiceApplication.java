package de.sbo.user.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import de.sbo.user.api.AliveController;
import de.sbo.user.impl.SimleEEBean;

@SpringBootApplication
@ComponentScan(basePackageClasses = {AliveController.class, SimleEEBean.class})
public class UserServiceApplication {

	public static void main(String[] args) {

	//test223
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
