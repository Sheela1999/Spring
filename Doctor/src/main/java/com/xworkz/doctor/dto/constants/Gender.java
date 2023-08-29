package com.xworkz.doctor.dto.constants;

public enum Gender {
	
	MALE("male"), FEMALE("female"), OTHERS("others");
	
	public String genderType;
	
	Gender(String genderType){
		this.genderType = genderType;
	}

}
