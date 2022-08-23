package main.controller;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getHome() {
		
		return "home";
	}
	
}
