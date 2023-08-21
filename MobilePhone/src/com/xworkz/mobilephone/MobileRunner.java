package com.xworkz.mobilephone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mobilephone.app.CameraPhone;
import com.xworkz.mobilephone.app.FeaturePhone;
import com.xworkz.mobilephone.app.Iphone;
import com.xworkz.mobilephone.app.MobileInterface;
import com.xworkz.mobilephone.app.Nokia;
import com.xworkz.mobilephone.app.OnePlus;
import com.xworkz.mobilephone.app.RealMe;
import com.xworkz.mobilephone.app.Redmi;
import com.xworkz.mobilephone.app.Samsung;
import com.xworkz.mobilephone.app.Smartphone;
import com.xworkz.mobilephone.app.Vivo;
import com.xworkz.mobilephone.config.AppConfig;

public class MobileRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("context...............................................................");

		MobileInterface mobile1 = context.getBean(Vivo.class);

		mobile1.call();
		mobile1.message();

		MobileInterface mobile2 = context.getBean(CameraPhone.class);

		mobile2.call();
		mobile2.message();

		MobileInterface mobile3 = context.getBean(Nokia.class);

		mobile3.call();
		mobile3.message();

		MobileInterface mobile4 = context.getBean(Samsung.class);

		mobile4.call();
		mobile4.message();

		MobileInterface mobile5 = context.getBean(RealMe.class);

		mobile5.call();
		mobile5.message();

		MobileInterface mobile6 = context.getBean(Redmi.class);

		mobile6.call();
		mobile6.message();

		MobileInterface mobile7 = context.getBean(OnePlus.class);

		mobile7.call();
		mobile7.message();

		MobileInterface mobile8 = context.getBean(FeaturePhone.class);

		mobile8.call();
		mobile8.message();

		MobileInterface mobile9 = context.getBean(Iphone.class);

		mobile9.call();
		mobile9.message();

		MobileInterface mobile10 = context.getBean(Smartphone.class);

		mobile10.call();
		mobile10.message();

	}

}
