package com.xworkz.lawyer.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class LawyerServiceImpl implements LawyerService {

	@Override
	public boolean validate(String userName, String email, String password, Model model) {
		if(userName != null && email != null && password != null) {
			if(userName.length()>=4 && !userName.isEmpty()) {
				if(email.length()>=14 && !email.isEmpty()) {
					if(password.length()>=8 && !password.isEmpty()) {
						System.out.println("Data is validated");
						return true;
					}
					model.addAttribute("isUserNameValid", "User name is not valid");
					System.out.println("User name is not valid");
					return false;
				}
				model.addAttribute("isEmailValid", "Email is not valid");
				System.out.println("Email is not valid");
				return false;
			}
			model.addAttribute("isPasswordValid", "Password is not valid");
			return false;
		}
		return false;
	}

}
