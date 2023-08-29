package com.xworkz.hospital.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.xworkz.hospital.dto.HospitalDto;

@Component
@Primary
public class HospRepos implements HospitalRepo {

	@Override
	public boolean save(HospitalDto dto) {
		System.out.println("This is for primary annotation");
		return true;
	}

}
