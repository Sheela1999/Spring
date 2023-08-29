package com.xworkz.doctor.service;

import java.util.List;

import com.xworkz.doctor.dto.DoctorDto;

public interface DoctorService {

	public boolean save(DoctorDto dto);

	public List<DoctorDto> findByName(String name);

	public boolean dtoExist(String name);

}
