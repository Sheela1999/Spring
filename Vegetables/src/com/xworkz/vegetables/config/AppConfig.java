package com.xworkz.vegetables.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.vegetables.app.Carrot;
import com.xworkz.vegetables.app.Peas;

@Configuration
public class AppConfig {

	@Bean
	public Carrot getCarrot() {
		return new Carrot();
	}

	@Bean
	public Peas getPeas() {
		return new Peas();
	}

}
