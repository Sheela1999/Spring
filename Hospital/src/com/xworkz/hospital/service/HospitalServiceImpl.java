package com.xworkz.hospital.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.repo.HospitalRepo;

@Component
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	private HospitalRepo repo;

	@PostConstruct
	@Override
	public boolean save(HospitalDto dto) {
		System.out.println("data....");
		repo.save(dto);
		return true;
	}

}
