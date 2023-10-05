package com.xworkz.landrecord.service;

import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.AdminDto;

public interface AdminService {
	
	public boolean validate(AdminDto dto, Model model);
	
	public AdminDto findByNameAndEmail(String adminName, String email, Model model);
	
	public String generateOTP();

}
