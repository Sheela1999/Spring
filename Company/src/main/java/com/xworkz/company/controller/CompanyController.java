package com.xworkz.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.company.dto.CompanyDto;

@Controller
public class CompanyController {
	
	@RequestMapping(value = "/job", method = RequestMethod.POST)
	public String getWork(CompanyDto dto, Model model) {
		System.out.println(dto);
		model.addAttribute("dto", dto);
		return "Welcome";
		
		
	}

}
