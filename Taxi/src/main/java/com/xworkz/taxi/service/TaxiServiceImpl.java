package com.xworkz.taxi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.repository.TaxiRepo;
import com.xworkz.taxi.repository.TaxiRepoImpl;

@Component
public class TaxiServiceImpl implements TaxiService {

	private TaxiRepo repo = new TaxiRepoImpl();

	@Override
	public boolean saveTaxi(TaxiDto dto) {
		if (dto != null) {
			if (dto.getId() > 0) {
				if (dto.getTaxiNo() != null && dto.getTaxiNo().length() >= 6) {
					if (dto.getEarnings() > 500 && dto.getEarnings() <= 6000) {
						if (dto.getLocation() != null) {
							if (dto.getNoOfTrips() >= 1 && dto.getNoOfTrips() < 20) {
								System.out.println("all the fields are validated, and ready to save");
								repo.saveTaxi(dto);
								return true;
							}
							System.out.println("trips are not valid");
							return false;
						}
						System.out.println("location is not valid");
						return false;
					}
					System.out.println("Earning is not valid");
					return false;
				}
				System.out.println("given taxi no is wrong");
				return false;
			}
			System.out.println("id must be greater than 0");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public List<TaxiDto> readAll() {
		return repo.readAll();
	}

	@Override
	public TaxiDto findTaxiByLocation(String location) {
		if (location != null) {
			return repo.findTaxiByLocation(location);
		}
		System.out.println("location is not valid");
		return null;
	}

	@Override
	public boolean updateTaxiEarningsById(int id, int earnings) {
		if (id > 0) {
			if (earnings > 5000 && earnings <= 50000) {
				repo.updateTaxiEarningsById(id, earnings);
				return true;
			}
			System.out.println("id is not valid");
			return false;
		}
		System.out.println("earning is not matching");
		return false;
	}

	@Override
	public boolean updateTaxiAvailableById(int id, boolean isAvailable) {
		if (id > 0) {
			return repo.updateTaxiAvailableById(id, isAvailable);
		}
		System.out.println("id is not valid");
		return false;
	}

	@Override
	public List<TaxiDto> findAllAvailableTaxi(boolean isAvailable) {
		return repo.findAllAvailableTaxi(isAvailable);
	}

	@Override
	public TaxiDto bookTaxi() {
		return repo.bookTaxi();
	}

}
