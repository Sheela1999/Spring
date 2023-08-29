package com.xworkz.hospital.repo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.hospital.dto.HospitalDto;

@Component
public class HospitalRepoImpl implements HospitalRepo {
	
	@Autowired
	private List<HospitalDto> list;

	@Override
	public boolean save(HospitalDto dto) {
		list.add(dto);
		System.out.println("Data Saved...");
		return true;
	}

}
