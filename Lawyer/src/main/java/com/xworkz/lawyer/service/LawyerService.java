package com.xworkz.lawyer.service;

import org.springframework.ui.Model;

public interface LawyerService {
	
	public boolean validate(String userName, String email, String password, Model model);

}
