package com.logim360.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.logim360.dto.Users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HomeController {

	@GetMapping("/add")
	public int addValue(@RequestParam("a") int a, @RequestParam("b") int b) {
		return a + b;
	}

	@GetMapping("/mul/{a}/{b}")
	public int mul (@PathVariable("a") int a, @PathVariable("b") int b) {
		return a * b;
	}
		
		@PostMapping("/save")
		public String saveUserData(@RequestBody Users users) {
			if(users.getUserName().equals("Manoje")) {
				return "Valid userName";
			}
			
			return "Invalid Username";
		}
		
		 
	
	
}
