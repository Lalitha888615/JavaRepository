package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class ProductController {

	@RequestMapping("/display")
	public String display() {
		return "display";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("info", "Under Construction");
		mv.setViewName("help");
		return mv;
	}
}
