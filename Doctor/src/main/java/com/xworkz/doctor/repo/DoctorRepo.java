package com.xworkz.doctor.repo;

import java.util.List;

import com.xworkz.doctor.dto.DoctorDto;

public interface DoctorRepo {
	
	public boolean save(DoctorDto dto);
	
	public List<DoctorDto> findByName(String name);
	

}
