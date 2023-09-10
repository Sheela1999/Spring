package com.xworkz.lawyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.lawyer.dto.ClientDto;
import com.xworkz.lawyer.service.LawyerService;

@Controller
public class ClientController {

	@Autowired
	private LawyerService service;

	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public String getClients(Model model) {
		model.addAttribute("welcome", "welcome all.....");
		return "Court";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String getForm(@RequestParam String userName, @RequestParam String email,
			@RequestParam String password, Model model) {
		System.out.println(userName);
		System.out.println(email);
		System.out.println(password);

		boolean validData = service.validate(userName, email, password, model);
		System.out.println(validData);
		
		return "Court";

	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String getData(ClientDto dto, Model model) {
		System.out.println(dto);
		model.addAttribute("dto", dto);
		return "Court";
		
	}

}
