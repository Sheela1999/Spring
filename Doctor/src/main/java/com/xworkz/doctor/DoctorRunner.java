package com.xworkz.doctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.doctor.config.DoctorConfig;
import com.xworkz.doctor.dto.DoctorDto;
import com.xworkz.doctor.dto.constants.Gender;
import com.xworkz.doctor.service.DoctorService;
import com.xworkz.doctor.service.DoctorServiceImpl;

public class DoctorRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(DoctorConfig.class);

		DoctorService service = context.getBean(DoctorServiceImpl.class);

		DoctorDto dto = new DoctorDto(1, "Dr. Shilpa", 70000, "MBBS", "Cardiologists", "Bangalore", Gender.FEMALE,
				"Surgery");

		DoctorDto dto2 = new DoctorDto(2, "Dr. Aman", 60000, "BDS", "dentists", "Shivmoga", Gender.MALE,
				"Internal medicine");

		DoctorDto dto3 = new DoctorDto(3, "Dr. Sahana", 200000, "MBBS,MD", "gynecologists", "Belagavi", Gender.FEMALE,
				"gynaecology");

		DoctorDto dto4 = new DoctorDto(5, "Dr. Bhavya", 300000, "MBBS", "pediatricians", "Mangalore", Gender.FEMALE,
				"Pediatrics");

//		boolean savedData = service.save(dto);
//		System.out.println(savedData);
//		
//		boolean savedData1 = service.save(dto2);
//		System.out.println(savedData1);
//		
//		boolean savedData2 = service.save(dto3);
//		System.out.println(savedData2);

		boolean existedData = service.dtoExist(dto.getName());

		boolean saved = service.save(dto4);
		System.out.println(saved);

	}

}
