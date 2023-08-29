package com.xworkz.hospital.dto;

import java.io.Serializable;

public class HospitalDto implements Serializable {

	private Integer id;
	private String name;
	private String location;
	private Integer noOfDoctors;
	private Integer maxFees;
	private String treatments;

	public HospitalDto() {
		super();
	}

	public HospitalDto(Integer id, String name, String location, Integer noOfDoctors, Integer maxFees,
			String treatments) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.noOfDoctors = noOfDoctors;
		this.maxFees = maxFees;
		this.treatments = treatments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(Integer noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public Integer getMaxFees() {
		return maxFees;
	}

	public void setMaxFees(Integer maxFees) {
		this.maxFees = maxFees;
	}

	public String getTreatments() {
		return treatments;
	}

	public void setTreatments(String treatments) {
		this.treatments = treatments;
	}

	@Override
	public String toString() {
		return "HospitalDto [id=" + id + ", name=" + name + ", location=" + location + ", noOfDoctors=" + noOfDoctors
				+ ", maxFees=" + maxFees + ", treatments=" + treatments + "]";
	}

}
