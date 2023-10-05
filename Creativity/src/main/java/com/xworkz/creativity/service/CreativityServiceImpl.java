package com.xworkz.creativity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.creativity.dto.CreativityDto;
import com.xworkz.creativity.repository.CreativityRepo;

@Service
public class CreativityServiceImpl implements CreativityService {
	
	@Autowired
	private CreativityRepo repo;

	@Override
	public boolean validate(CreativityDto dto, Model model) {
		System.out.println("validating....");
		boolean valid = true;
		if(dto == null) {
			model.addAttribute("dtoValidate", "Dto is Null");
			System.out.println("dto is null");
		}
			if(dto.getName() == null || dto.getName().length() <=3 || dto.getName().isEmpty()) {
				model.addAttribute("IsNameValid", "Name is not valid");
				System.out.println("Name is not valid");
				valid = false;
			}
			if(dto.getEmail() == null || dto.getEmail().length() <=3 || dto.getEmail().isEmpty()) {
				model.addAttribute("IsEmailValid", "Email is not valid");
				System.out.println("Email is not valid");
				valid = false;
			}
			if(dto.getPhoneNo() == null || dto.getPhoneNo() <=699999999 || dto.getPhoneNo() >= 999999999) {
				model.addAttribute("IsPhoneNoValid", "Invalid Phone Number");
				System.out.println("Invalid Phone Number");
				valid = false;
			}
			if(dto.getFatherName() == null || dto.getFatherName().length() <=3 || dto.getFatherName().isEmpty()) {
				model.addAttribute("IsFatherNameValid", "Father Name is not valid");
				System.out.println("Father name is not valid");
				valid = false;
			}
			if(dto.getMotherName() == null || dto.getMotherName().length() <=3 || dto.getMotherName().isEmpty()) {
				model.addAttribute("IsMotherNameValid", "Mother Name is not valid");
				System.out.println("Mother name is not valid");
				valid = false;
			}
			if(dto.getDateOfBirth() == null || dto.getDateOfBirth().isEmpty()) {
				model.addAttribute("IsDateOfBirthValid", "Date of Birth is not valid");
				System.out.println("Data of birth is not valid");
				valid = false;
			}
			if(dto.getLocation() == null || dto.getLocation().length() <=3 || dto.getLocation().isEmpty()) {
				model.addAttribute("IsLocationValid", "Location is not valid");
				System.out.println("Location is not valid");
				valid = false;
			}
		return valid;
	}

	@Override
	public boolean save(CreativityDto dto, Model model) {
		boolean validated = validate(dto, model);
		
		if(validated == true) {
			repo.save(dto);
			return true;
		}
		return false;
	}

}
