package com.xworkz.creativity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.creativity.dto.CreativityDto;
import com.xworkz.creativity.service.CreativityService;

@Controller
public class CreativityController {

	@Autowired
	private CreativityService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addChildInfo(CreativityDto dto, Model model) {
		boolean status = service.save(dto, model);

		if (status) {
			model.addAttribute("dto", "Dto saved..");
			return "Registration";
		} else {
			model.addAttribute("dto", "Dto is not saved..");
			return "Registration";
		}

	}

}
