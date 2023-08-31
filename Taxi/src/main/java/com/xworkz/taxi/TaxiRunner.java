package com.xworkz.taxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.taxi.config.TaxiConfig;
import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

public class TaxiRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(TaxiConfig.class);
		
		TaxiService service = context.getBean(TaxiServiceImpl.class);
		
//		TaxiDto dto = new TaxiDto(1, "KA 1234", 10000, true, "Shivmoga", 5);
//		
//		TaxiDto dto2 = new TaxiDto(2, "MA 5234", 20000, true, "Kollapur", 10);
//		
//		TaxiDto dto3 = new TaxiDto(3, "KA 4168", 30000, true, "Bangalore", 8);
//		
//		TaxiDto dto4 = new TaxiDto(4, "TN 9234", 8000, true, "Ooty", 4);
//		
//		TaxiDto dto5 = new TaxiDto(5, "KE 7234", 50000, true, "Kerala", 15);
//		
//		TaxiDto dto6 = new TaxiDto(6, "KA 1234", 16000, true, "Belagavi", 19);
		
//		boolean savedData = service.saveTaxi(dto2);
//		System.out.println(savedData);
//		boolean savedData1 = service.saveTaxi(dto3);
//		System.out.println(savedData1);
//		boolean savedData2 = service.saveTaxi(dto4);
//		System.out.println(savedData2);
//		boolean savedData3 = service.saveTaxi(dto5);
//		System.out.println(savedData3);
//		boolean savedData4 = service.saveTaxi(dto6);
//		System.out.println(savedData4);
		
		System.out.println("--------------------------updatedLbyId-------------------------------------");
		boolean updated = service.updateTaxiEarningsById(5, 50000);
		System.out.println(updated);
		
		System.out.println("-----------------------------update---------------------------------------");
		boolean updatedData = service.updateTaxiAvailableById(2, false);
		System.out.println(updatedData);
		
		System.out.println("---------------------------find----------------------------------------------------");
		TaxiDto foundData = service.findTaxiByLocation("Belagavi");
		System.out.println(foundData);
		
		System.out.println("-----------------------------------findAll-----------------------------------------------");
		List<TaxiDto> found = service.findAllAvailableTaxi(true);
		for (TaxiDto dtoss : found) {
			System.out.println(dtoss);
		}
		
		System.out.println("--------------------------BookTaxi-----------------------------------------------------");
//		List<TaxiDto> booked = service.bookTaxi(true, 2500);
//		for (TaxiDto taxi : booked) {
//			System.out.println(taxi);
//		}
		
		System.out.println("---------------------------------readAll--------------------------------------------");
		List<TaxiDto> readData = service.readAll();
		for (TaxiDto dtos : readData) {
			System.out.println(dtos);
		}

	}

}
