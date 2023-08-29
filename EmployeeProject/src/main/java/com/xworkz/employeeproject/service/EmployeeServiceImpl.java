package com.xworkz.employeeproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.employeeproject.dto.EmployeeDto;
import com.xworkz.employeeproject.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public boolean save(EmployeeDto dto) {
		if (dto != null) {
			if (dto.getId() > 0) {
				if (dto.getEmployeeName() != null && dto.getEmployeeName().length() > 3) {
					if (dto.getCompanyName() != null) {
						if (dto.getEmployeeId() > 1000 && dto.getEmployeeId() < 5000) {
							if (dto.getDesignation() != null) {
								if (dto.getAddress() != null) {
									if (dto.getAge() > 20 && dto.getAge() < 40) {
										if (dto.getEducation() != null) {
											if (dto.getEmail() != null) {
												if (dto.getContactNo() > 0 && dto.getContactNo() >= 10) {
													if (dto.getSalary() > 20000 && dto.getSalary() < 2500000) {
														System.out.println(
																"All the fields are validated, and ready to save");
														repo.save(dto);
														return true;
													}
													System.out.println("salary is not valid");
													return false;
												}
												System.out.println("Invalid Contact Number");
												return false;
											}
											System.out.println("Email is not valid");
											return false;
										}
										System.out.println("Education is not valid");
										return false;
									}
									System.out.println("Age is not valid");
									return false;
								}
								System.out.println("given adress is wrong");
								return false;
							}
							System.out.println("designation is not matching");
							return false;
						}
						System.out.println("Employee id is not valid");
						return false;
					}
					System.out.println("company name is not valid");
					return false;
				}
				System.out.println("Employee name is not valid");
				return false;
			}
			System.out.println("id must be greater Than 0");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}
	
	@Override
	public List<EmployeeDto> readAll() {
		return repo.readAll();
	}

	@Override
	public EmployeeDto findByEmployeeName(String name) {
		if(name != null) {
			return repo.findByEmployeeName(name);
		}
		System.out.println("name is null");
		return null;
	}

	@Override
	public EmployeeDto findSalaryByEmployeeName(int salary, String name) {
		if(salary >20000 && salary <2500000) {
			return repo.findSalaryByEmployeeName(salary, name);
		}
		System.out.println("salary is not valid");
		return null;
	}

	@Override
	public boolean updateDesignationByEmployeeName(String name, String designation) {
		if(name != null) {
			if(designation != null) {
				repo.updateDesignationByEmployeeName(name, designation);
				return true;
			}
			System.out.println("designation is not valid");
			return false;
		}
		System.out.println("Employee name is not valid");
		return false;
	}

	@Override
	public boolean updateCompanyNameandEducationByEmployeeName(String companyName, String education, String name) {
		if(companyName != null) {
			if(education != null) {
				if(name != null) {
					repo.updateCompanyNameandEducationByEmployeeName(companyName, education, name);
					return true;
				}
				System.out.println("Employee name is not valid");
				return false;
			}
			System.out.println("Education is not valid");
			return false;
		}
		System.out.println("Company name is not valid");
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(id >0) {
			repo.deleteById(id);
			return true;
		}
		System.out.println("id is not valid");
		return false;
	}

	@Override
	public boolean deleteByAddressAndEmail(String address, String email) {
		if(address != null) {
			if(email != null) {
				repo.deleteByAddressAndEmail(address, email);
				return true;
			}
			System.out.println("Email is not valid");
			return false;
		}
		System.out.println("address is not valid");
		return false;
	}

}
