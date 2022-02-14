package de.sbo.user.impl;

import org.springframework.stereotype.Component;

@Component
public class SimpleComponent {
	
	public String sayHello() {
		return "hello spring";
	}

}
