package com.abhi.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showMyPage() {
	    System.out.println("Hello bro");
		return "main-menu";
	}
	
	@RequestMapping("/home")
	public String homePage() {
	    System.out.println("Hello home page bro");
		return "main-menu";
	}
}
