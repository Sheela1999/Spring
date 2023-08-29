package com.xworkz.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.hospital.config.HospitalConfig;
import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalRunner {
	
	public static void main(String[] args) {
		
		HospitalDto dto = new HospitalDto(1, "Jayadeva", "BTM", 1000, 100000, "CABG (Bypass) Surgery");
		HospitalDto dto1 = new HospitalDto(2, "Narayana", "Bommasandra", 2000, 200000, "Nephrology");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HospitalConfig.class);
		
		HospitalService service = context.getBean(HospitalServiceImpl.class);
		
		service.save(dto);
		service.save(dto1);
		
	}

}
