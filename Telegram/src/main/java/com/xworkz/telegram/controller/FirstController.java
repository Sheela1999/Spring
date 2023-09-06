package com.xworkz.telegram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String getMessage(Model model) {
		System.out.println("telegram messages...");
		model.addAttribute("Hii", "from Sheela");
		model.addAttribute("hello", "from pallavi");
		return "Welcome";
		
	}

}
