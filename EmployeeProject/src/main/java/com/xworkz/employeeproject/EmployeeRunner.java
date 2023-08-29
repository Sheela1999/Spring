package com.xworkz.employeeproject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.employeeproject.config.EmployeeConfig;
import com.xworkz.employeeproject.dto.EmployeeDto;
import com.xworkz.employeeproject.service.EmployeeService;
import com.xworkz.employeeproject.service.EmployeeServiceImpl;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		EmployeeService service = context.getBean(EmployeeServiceImpl.class);
        
		EmployeeDto dto = new EmployeeDto(1, "Pallavi", "Infosys", 1234, "Developer", "Hubli", 22, "BSc", "pallavi@gmail.com", 1234567890l, 45000);
		
		EmployeeDto dto1 = new EmployeeDto(2, "Sheela", "Wipro", 2234, "Software Engineer", "Bangalore", 24, "B.E", "sheela@gmail.com", 2353567891l, 30000);
		
		EmployeeDto dto2 = new EmployeeDto(3, "Nikitha", "Congnizant", 3134, "Engineer", "Shivmoga", 23, "BSc", "nikitha@gmail.com", 4563456789l, 40000);
		
		EmployeeDto dto3 = new EmployeeDto(4, "Maha", "Google", 4254, "Java Developer", "TamilNadu", 21, "B.E", "maha@gmail.com", 8234567890l, 55000);
		
		EmployeeDto dto4 = new EmployeeDto(5, "Aishu", "TechMahindra", 1494, "Embedded Engineer", "Bangalore", 24, "B.E", "aishu@gmail.com", 6234567891l, 35000);
		
		EmployeeDto dto5 = new EmployeeDto(6, "Rohini", "Vayavya", 4673, "Hardware Engineer", "Belagavi", 25, "B.E", "rohini@gmail.com", 7234676789l, 32000);
		
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
		
		EmployeeDto foundData = service.findByEmployeeName("'Pallavi'");
		System.out.println(foundData);
		
		System.out.println("--------------------------------------FindBy2Fields----------------------------------------------------------");
		
		EmployeeDto found = service.findSalaryByEmployeeName(30000, "'Sheela'");
		System.out.println(found);
		
		System.out.println("-------------------------------------------update------------------------------------------------------------");
		boolean updatedData = service.updateDesignationByEmployeeName("'Nikitha'", "PHP Engineer");
		System.out.println(updatedData);
		
		System.out.println("-------------------------------------update2fields-----------------------------------------------------------");
		boolean updated = service.updateCompanyNameandEducationByEmployeeName("Amazon", "B.E(CSE)", "'Maha'");
		System.out.println(updated);
		
//		System.out.println("---------------------------delete----------------------------------------------------------------------------");
//		boolean deleted = service.deleteById(5);
//		System.out.println(deleted);
		
		System.out.println("------------------------------------------------------delete2fields-------------------------------------------");
//		boolean dltData = service.deleteByAddressAndEmail("'Belagavi'", "rohini@gmail.com");
//		System.out.println(dltData);
		
		System.out.println("--------------------------------------------ReadAll----------------------------------------------------------");
		List<EmployeeDto> ReadData = service.readAll();
		for (EmployeeDto dtos : ReadData) {
			System.out.println(dtos);
		}

	}

}
