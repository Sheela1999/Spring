package com.xworkz.doctor.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.xworkz.doctor.dto.constants.Gender;

@Table(name = "doctors_info")
@NamedQuery(name = "findByName", query = "Select dto from DoctorDto dto where dto.name=:nm")
@Entity
public class DoctorDto implements Serializable {

	@Id
	private int id;
	private String name;
	private int salary;
	private String education;
	private String designation;
	private String location;
	private Gender gender;
	private String specialist;

	public DoctorDto() {
		super();
	}

	public DoctorDto(int id, String name, int salary, String education, String designation, String location,
			Gender gender, String specialist) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.education = education;
		this.designation = designation;
		this.location = location;
		this.gender = gender;
		this.specialist = specialist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	@Override
	public String toString() {
		return "DoctorDto [id=" + id + ", name=" + name + ", salary=" + salary + ", education=" + education
				+ ", designation=" + designation + ", location=" + location + ", gender=" + gender + ", specialist="
				+ specialist + "]";
	}

}
