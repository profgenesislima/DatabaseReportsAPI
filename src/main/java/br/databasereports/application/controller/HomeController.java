package br.databasereports.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String index() {	
		System.out.println("INDEX ON CONTROLLER");	
	   return "index";
	}
	
}
