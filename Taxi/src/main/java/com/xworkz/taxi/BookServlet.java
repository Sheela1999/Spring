package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

@WebServlet(value="/book")
public class BookServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this book taxi Servlet....");
		
		TaxiService service = new TaxiServiceImpl();

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		TaxiDto dto = service.bookTaxi();
		writer.print("Taxi Booked Successfully");
		
		if(dto != null) {
			writer.print("<div>");
			writer.println(dto.getId());
			writer.println(dto.getTaxiNo());
			writer.println(dto.isAvailable());
			writer.println(dto.getLocation());
			writer.print("</div>");
		}
		
		
	}

}
