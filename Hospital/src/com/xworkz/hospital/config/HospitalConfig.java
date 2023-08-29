package com.xworkz.hospital.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.xworkz.hospital.dto.HospitalDto;

@Configuration
@Lazy
@ComponentScan("com.xworkz.hospital")
public class HospitalConfig {
	
	@Bean
	public List<HospitalDto> getList(){
		return new ArrayList<HospitalDto>();
	}

}
