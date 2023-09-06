package com.xworkz.telegram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.telegram")
@EnableWebMvc
public class BeanConfig implements WebMvcConfigurer{
	
	public BeanConfig() {
		System.out.println("Bean config is created");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		
		return new InternalResourceViewResolver("/WEB-INF/", ".jsp");
		
	}

}
