package com.kkhindigyanapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class HelloController {
	
	  @GetMapping("/") 
	  public String hello() {
		return "Hello World 12345";
		
	}
	  
	@PostMapping("/postvalues")
		
		public String postvalues(@RequestBody String studentName) {
			
			return studentName;
		}
		  
	  }
	  