package com.xworkz.hospital.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.xworkz.hospital.dto.HospitalDto;

@Configuration
@ComponentScan("com.xworkz.hospital")
@Lazy
public class HospitalConfig {
	
	@Bean
	@Lazy(true)
	public List<HospitalDto> getList(){
		return new ArrayList<HospitalDto>();
	}

}
