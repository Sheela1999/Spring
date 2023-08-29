package com.xworkz.employeeproject.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employee")
@Entity
public class EmployeeDto {

	@Id
	private int id;
	private String employeeName;
	private String companyName;
	private int employeeId;
	private String designation;
	private String address;
	private int age;
	private String education;
	private String email;
	private long contactNo;
	private int salary;

	public EmployeeDto() {
		super();
	}

	public EmployeeDto(int id, String employeeName, String companyName, int employeeId, String designation,
			String address, int age, String education, String email, long contactNo, int salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.companyName = companyName;
		this.employeeId = employeeId;
		this.designation = designation;
		this.address = address;
		this.age = age;
		this.education = education;
		this.email = email;
		this.contactNo = contactNo;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", employeeName=" + employeeName + ", companyName=" + companyName
				+ ", employeeId=" + employeeId + ", designation=" + designation + ", address=" + address + ", age="
				+ age + ", education=" + education + ", email=" + email + ", contactNo=" + contactNo + ", salary="
				+ salary + "]";
	}

}
