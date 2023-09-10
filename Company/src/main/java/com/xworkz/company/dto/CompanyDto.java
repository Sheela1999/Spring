package com.xworkz.company.dto;

public class CompanyDto {

	private String companyName;
	private String establishedOn;
	private String companySize;
	private String industry;
	private String headquarters;

	public CompanyDto() {
		super();
	}

	public CompanyDto(String companyName, String establishedOn, String companySize, String industry,
			String headquarters) {
		super();
		this.companyName = companyName;
		this.establishedOn = establishedOn;
		this.companySize = companySize;
		this.industry = industry;
		this.headquarters = headquarters;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEstablishedOn() {
		return establishedOn;
	}

	public void setEstablishedOn(String establishedOn) {
		this.establishedOn = establishedOn;
	}

	public String getCompanySize() {
		return companySize;
	}

	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	@Override
	public String toString() {
		return "CompanyDto [companyName=" + companyName + ", establishedOn=" + establishedOn + ", companySize="
				+ companySize + ", industry=" + industry + ", headquarters=" + headquarters + "]";
	}

}
