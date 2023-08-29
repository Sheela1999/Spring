package com.xworkz.employeeproject.service;

import java.util.List;

import com.xworkz.employeeproject.dto.EmployeeDto;

public interface EmployeeService {
	
	public boolean save(EmployeeDto dto);
	
	public List<EmployeeDto> readAll();
	
    public EmployeeDto findByEmployeeName(String name);
	
	public EmployeeDto findSalaryByEmployeeName(int salary, String name);
	
    public boolean updateDesignationByEmployeeName(String name, String designation);
	
	public boolean updateCompanyNameandEducationByEmployeeName(String companyName, String education, String name);
	
	public boolean deleteById(int id);
	
	public boolean deleteByAddressAndEmail(String address, String email);
	
	public boolean deleteByAddressAndEmployeeId(String address, int employeeId);

}
