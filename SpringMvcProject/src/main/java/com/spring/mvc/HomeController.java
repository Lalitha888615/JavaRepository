package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/overview")
	public String method1(Model model) {
		System.out.println("Im inside method1");
		model.addAttribute("username", "Yamini");
		return "home";			
	}
	
	@RequestMapping("/about")
	public String method2() {
		return "aboutus";
	}

}
