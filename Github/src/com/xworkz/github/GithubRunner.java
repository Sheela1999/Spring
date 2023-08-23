package com.xworkz.github;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.github.config.AppConfig;
import com.xworkz.github.dto.GithubDto;
import com.xworkz.github.service.GithubService;
import com.xworkz.github.service.GithubServiceImpl;

public class GithubRunner {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,22,55);
		List<String> list2 = Arrays.asList("Java","Spring");
		
		List<Integer> list3 = Arrays.asList(1,12,15);
		List<String> list4 = Arrays.asList("Html", "Sql");
		List<String> list5 = Arrays.asList("Servlet");
		
		GithubDto dto = new GithubDto(1, "Pallavi60", "pa@123", "pallavi@gmail.com", list1, list2);
		GithubDto dto1 = new GithubDto(2, "Nikitha23", "nikki@12", "nikitha@gmail.com", list3, list4);
		GithubDto dto2 = new GithubDto(3, "Maha", "ma@12", "laxmi@gmail.com", list1, list2);
		GithubDto dto3 = new GithubDto(4, "Sheela23", "shee@12", "sheela@gmail.com", list3, list4);
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		GithubService service = context.getBean(GithubServiceImpl.class);
		
		boolean saved = service.save(dto);
		System.out.println(saved);
		
		boolean saving = service.save(dto1);
		System.out.println(saving);
		
		 service.save(dto2);
		 
		 service.save(dto3);
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		boolean updated = service.update("Pallavi60", "Pallu@1");
		System.out.println(updated);
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		boolean deleted = service.delete(2, "nikitha@gmail.com");
		System.out.println(deleted);
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		boolean update = service.updateByList(4, list5);
		System.out.println(update);
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		List<GithubDto> list = service.readAll();
        for (GithubDto dtos : list) {
			System.out.println(dtos);
		}
	}

}
