package com.xworkz.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.college.app.Alvas;
import com.xworkz.college.app.CollegeInterface;
import com.xworkz.college.app.Excellent;
import com.xworkz.college.app.Kle;
import com.xworkz.college.app.Sahyadri;
import com.xworkz.college.app.Sdm;
import com.xworkz.college.config.CollegeConfig;

public class CollegeRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		CollegeInterface clg = context.getBean(Alvas.class);
		clg.knowledge();
		clg.skills();
		clg.getJobOpportunity();
		
		CollegeInterface college = context.getBean(Excellent.class);
		college.knowledge();
		college.skills();
		college.getJobOpportunity();
		
		CollegeInterface college3 = context.getBean(Sahyadri.class);
		college3.knowledge();
		college3.skills();
		college3.getJobOpportunity();
		
		CollegeInterface college4 = context.getBean(Kle.class);
		college4.knowledge();
		college4.skills();
		college4.getJobOpportunity();
		
		CollegeInterface college5 = context.getBean(Sdm.class);
		college5.knowledge();
		college5.skills();
		college5.getJobOpportunity();
		
		

	}

}
