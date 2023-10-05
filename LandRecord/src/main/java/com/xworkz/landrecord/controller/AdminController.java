package com.xworkz.landrecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.landrecord.dto.AdminDto;
import com.xworkz.landrecord.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginData(@RequestParam String adminName, @RequestParam String email, Model model) {
		AdminDto foundData = service.findByNameAndEmail(adminName, email, model);
		if (foundData != null) {
			System.out.println("Email is Verified");
			System.out.println(foundData);
			String generatedOTP = service.generateOTP();
			System.out.println(generatedOTP);
			return "SignIn";
		} else {
			model.addAttribute("IsAccountExist", "Account not exist");
			System.out.println("Account not exist");
			return "SignIn";
		}
	}
}
