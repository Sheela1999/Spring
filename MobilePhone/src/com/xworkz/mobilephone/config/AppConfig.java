package com.xworkz.mobilephone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mobilephone.app.CameraPhone;
import com.xworkz.mobilephone.app.FeaturePhone;
import com.xworkz.mobilephone.app.Iphone;
import com.xworkz.mobilephone.app.Nokia;
import com.xworkz.mobilephone.app.OnePlus;
import com.xworkz.mobilephone.app.RealMe;
import com.xworkz.mobilephone.app.Redmi;
import com.xworkz.mobilephone.app.Samsung;
import com.xworkz.mobilephone.app.Smartphone;
import com.xworkz.mobilephone.app.Vivo;

@Configuration
public class AppConfig {

	@Bean
	public CameraPhone getCameraPhone() {
		System.out.println("returning from Camera Phone");
		return new CameraPhone();
	}

	@Bean
	public FeaturePhone getFeaturePhone() {
		System.out.println("This is Feature phone Bean");
		return new FeaturePhone();
	}

	@Bean
	public Iphone getIphone() {
		System.out.println("returning from Iphone");
		return new Iphone();
	}

	@Bean
	public Nokia getNokia() {
		System.out.println("Nokia phone is having Basic set");
		return new Nokia();
	}

	@Bean
	public OnePlus getOnePlus() {
		System.out.println("One Plus returning the object");
		return new OnePlus();
	}

	@Bean
	public RealMe getRealMe() {
		System.out.println("returning From ReamMe");
		return new RealMe();
	}

	@Bean
	public Redmi getRedmi() {
		System.out.println("returning From Redmi");
		return new Redmi();
	}

	@Bean
	public Samsung gerSamsung() {
		System.out.println("samsung is a smartPhone");
		return new Samsung();
	}

	@Bean
	public Smartphone getSmartphone() {
		System.out.println("retruning from Smartphone");
		return new Smartphone();
	}

	@Bean
	public Vivo getVivo() {
		System.out.println("Vivo Bean is Stored in Inversion of Control(IOC) Container");
		return new Vivo();
	}

}
