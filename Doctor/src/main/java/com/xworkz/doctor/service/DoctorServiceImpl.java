package com.xworkz.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.doctor.dto.DoctorDto;
import com.xworkz.doctor.repo.DoctorRepo;

@Component
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepo repo;

	@Override
	public boolean save(DoctorDto dto) {
		if (!dtoExist(dto.getName())) {
			// return false;
			// }
			if (dto != null) {
				if (dto.getId() > 0) {
					if (dto.getName() != null && dto.getName().length() > 3) {
						if (dto.getSalary() > 50000 && dto.getSalary() <= 3000000) {
							if (dto.getDesignation() != null) {
								if (dto.getLocation() != null) {
									if (dto.getEducation() != null) {
										if (dto.getGender() != null) {
											if (dto.getSpecialist() != null) {
												System.out.println("Data validated, ready to save");
												repo.save(dto);
												return true;
											}
											System.out.println("Specialist field is not valid");
											return false;
										}
										System.out.println("gender not matching");
										return false;
									}
									System.out.println("education is not valid");
									return false;
								}
								System.out.println("location not valid");
								return false;
							}
							System.out.println("designation is not matching");
							return false;
						}
						System.out.println("salary is not valid");
						return false;
					}
					System.out.println("name is not valid");
					return false;
				}
				System.out.println("id must be greater than 0");
				return false;
			}
			System.out.println("dto is null");
			return false;
		}
		System.out.println("Dto already exist");
		return false;
	}

	@Override
	public List<DoctorDto> findByName(String name) {
		List<DoctorDto> list = repo.findByName(name);
		if (list != null) {
			System.out.println("given dto is not null from FindByName");
			return list;
		}
		System.out.println("dto service");
		return null;
	}

	@Override
	public boolean dtoExist(String name) {
		if (findByName(name) != null) {
			System.out.println("given dto is not null from checkExists");

			return true;
		}
		System.out.println("dto1 service");
		return false;
	}

}
