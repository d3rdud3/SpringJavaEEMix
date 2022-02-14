package de.sbo.order.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AliveController {
	
	  @GetMapping("/alive")
	  ResponseEntity<String> isAlive() {
	    return ResponseEntity.ok().body("alive");
	  }

}
