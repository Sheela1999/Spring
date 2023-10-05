package com.xworkz.creativity.service;

import org.springframework.ui.Model;

import com.xworkz.creativity.dto.CreativityDto;

public interface CreativityService {
	
	public boolean validate(CreativityDto dto, Model model);
	
	public boolean save(CreativityDto dto, Model model);

}
