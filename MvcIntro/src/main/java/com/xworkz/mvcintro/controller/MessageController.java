package com.xworkz.mvcintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {
	
	@RequestMapping(value ="/send", method = RequestMethod.GET)
	public String sendMessage(Model model) {
		System.out.println("controller method is executed");
		if(true) model.addAttribute("sent", "message delivered Successfully");
		else model.addAttribute("sent", "message not delivered");
		return "Sending";
	}
	
	@RequestMapping(value = "/message")
	public String getMessage() {
		System.out.println("Method executed......");
		return "Welcome";
	}

}
