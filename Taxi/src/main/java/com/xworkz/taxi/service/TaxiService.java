package com.xworkz.taxi.service;

import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;

public interface TaxiService {
	
	public boolean saveTaxi(TaxiDto dto);
	
	public List<TaxiDto> readAll();
	
	public TaxiDto findTaxiByLocation(String location);
	
	public boolean updateTaxiEarningsById(int id, int earnings);
	
	public boolean updateTaxiAvailableById(int id, boolean isAvailable);
	
	public List<TaxiDto> findAllAvailableTaxi(boolean isAvailable);
	
	public List<TaxiDto> bookTaxi(boolean isAvailable, int earnings);

}
