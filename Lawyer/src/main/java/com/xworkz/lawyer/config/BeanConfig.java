package com.xworkz.lawyer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.lawyer")
@EnableWebMvc
public class BeanConfig implements WebMvcConfigurer{
	
	public BeanConfig() {
		System.out.println("Bean is ctreated");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "Lawyer.jsp");
	}
	
	public ViewResolver viewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/", ".jsp");
	}

}
