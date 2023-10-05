package com.xworkz.landrecord.repository;

import com.xworkz.landrecord.dto.AdminDto;

public interface AdminRepo {
	
	public AdminDto findByNameAndEmail(String adminName, String email) throws Exception;

}
