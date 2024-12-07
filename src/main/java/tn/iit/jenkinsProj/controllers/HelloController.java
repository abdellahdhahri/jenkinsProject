package tn.iit.jenkinsProj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = "*")
public class HelloController {
	
	
	
	@GetMapping("/hi")
	public String sayHello() {
		return "hello from controller";
	}
	

}
