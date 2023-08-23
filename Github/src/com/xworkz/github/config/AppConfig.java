package com.xworkz.github.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.github.dto.GithubDto;

@Configuration
@ComponentScan("com.xworkz.github")
public class AppConfig {
	
	@Bean
	public List<GithubDto> getList(){
		return new ArrayList<GithubDto>();
	}

}
