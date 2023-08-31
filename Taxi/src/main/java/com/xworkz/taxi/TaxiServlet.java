package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

@WebServlet(value="/save")
public class TaxiServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("servlet.....");
        
		String id = req.getParameter("id");
		String taxiNum = req.getParameter("taxiNo");
		String earn = req.getParameter("earnings");
		String isAvailable = req.getParameter("isAvailable");
		String location = req.getParameter("location");
		String numOfTrips = req.getParameter("noOfTrips");

		TaxiDto dto = new TaxiDto(Integer.valueOf(id), taxiNum, Integer.valueOf(earn), Boolean.valueOf(isAvailable), location, Integer.valueOf(numOfTrips));

		TaxiService service = new TaxiServiceImpl();

		boolean savedData = service.saveTaxi(dto);

		if (savedData == true) {
			req.getRequestDispatcher("/ViewTaxi.jsp").forward(req, resp);
			System.out.println("data saved Successfully");
		} else {
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			req.getRequestDispatcher("/Taxi.jsp").include(req, resp);
			writer.print("<h3>Data not valid so not saved</h3>");
		}

	}

}
