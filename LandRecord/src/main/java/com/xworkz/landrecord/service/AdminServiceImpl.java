package com.xworkz.landrecord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.AdminDto;
import com.xworkz.landrecord.repository.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepo repo;

	@Override
	public boolean validate(AdminDto dto, Model model) {
		boolean valid = true;
		if(dto == null) {
			model.addAttribute("dtoValidate", "Dto is Null");
			System.out.println("dto is null");
		}
		if(dto.getAdminName() == null || dto.getAdminName().length() <=3 || dto.getAdminName().isEmpty()) {
			model.addAttribute("IsAdminNameValid", "Admin Name is not valid");
			System.out.println("Admin Name is not valid");
			valid = false;
		}
		if(dto.getEmail() == null || dto.getEmail().length() <=3 || dto.getEmail().isEmpty()) {
			model.addAttribute("IsEmailValid", "Email is not valid");
			System.out.println("Email is not valid");
			valid = false;
		}
		if(dto.getOtp() == null || dto.getOtp() <=100000 || dto.getOtp() >= 1000000) {
			model.addAttribute("IsOTPvalid", "Invalid OTP, Please enter correct OTP");
			System.out.println("Invalid OTP, Please enter correct OTP");
			valid = false;
		}
		return valid;
	}

	@Override
	public AdminDto findByNameAndEmail(String adminName, String email, Model model) {
		if(adminName != null && !adminName.isEmpty() && adminName.length() > 3 
				&& adminName.length() <30 && email != null && !email.isEmpty()) {
			 try {
				return repo.findByNameAndEmail(adminName, email);
			} catch (Exception e) {
				System.out.println("No Result Found");
				return null;
			}
		}
		model.addAttribute("IsNameAndEmailValid", "Invalid Name or Email");
		return null;
	}

	@Override
	public String generateOTP() {
		int randomNo = (int)(Math.random() * 900000) + 1000;
		String otp = String.valueOf(randomNo);
		return otp;
	}

	
	
}
