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

@WebServlet(value = "/read")
public class ReadServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("read.. Servlet..");

		TaxiService service = new TaxiServiceImpl();

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		List<TaxiDto> list = service.findAllAvailableTaxi(true);
		writer.print("Data Read Successfully");

		for (TaxiDto dto : list) {
			writer.print("<div>");
			writer.println(dto.getId());
			writer.println(dto.getTaxiNo());
			writer.println(dto.getEarnings());
			writer.println(dto.isAvailable());
			writer.println(dto.getLocation());
			writer.println(dto.getNoOfTrips());
			writer.print("</div>");
		}
		
	  if(!list.isEmpty()) {
		  writer.println("<div><form action=\"book\" method=\"post\">\r\n"
		  		+ "<button type=\"submit\" name=\"bookTaxi\">BookTaxi</button>\r\n"
		  		+ "</form></div>");
	  }

	}

}
