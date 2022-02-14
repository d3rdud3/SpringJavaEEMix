package de.sbo.user.api;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.sbo.user.impl.SimleEEBean;
import de.sbo.user.impl.SimpleComponent;

@RestController
@RequestMapping("/api/v1")
public class AliveController {
	
	@Inject
	 private SimleEEBean bean;
	
	@Autowired
	private SimpleComponent component;
	
	  @GetMapping("/aliveEE")
	  ResponseEntity<String> isAliveEE() {
	    return ResponseEntity.ok().body(bean.sayHeallo());
	  }
	  
	  @GetMapping("/aliveSpring")
	  ResponseEntity<String> isAliveSpring() {
	    return ResponseEntity.ok().body(component.sayHello());
	  }

}
